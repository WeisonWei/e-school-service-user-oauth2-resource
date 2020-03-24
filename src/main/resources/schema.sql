--  资源管理服务器
CREATE TABLE IF NOT EXISTS `tb_content`
(
    `id`          bigint(20) NOT NULL AUTO_INCREMENT,
    `category_id` bigint(20) NOT NULL COMMENT '内容类目ID',
    `title`       varchar(200) DEFAULT NULL COMMENT '内容标题',
    `sub_title`   varchar(100) DEFAULT NULL COMMENT '子标题',
    `title_desc`  varchar(500) DEFAULT NULL COMMENT '标题描述',
    `url`         varchar(500) DEFAULT NULL COMMENT '链接',
    `pic`         varchar(300) DEFAULT NULL COMMENT '图片绝对路径',
    `pic2`        varchar(300) DEFAULT NULL COMMENT '图片2',
    `content`     text COMMENT '内容',
    `created`     datetime     DEFAULT NULL,
    `updated`     datetime     DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `category_id` (`category_id`),
    KEY `updated` (`updated`)
) AUTO_INCREMENT = 42
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `tb_content_category`
(
    `id`         bigint(20) NOT NULL AUTO_INCREMENT COMMENT '类目ID',
    `parent_id`  bigint(20)  DEFAULT NULL COMMENT '父类目ID=0时，代表的是一级的类目',
    `name`       varchar(50) DEFAULT NULL COMMENT '分类名称',
    `status`     int(1)      DEFAULT '1' COMMENT '状态。可选值:1(正常),2(删除)',
    `sort_order` int(4)      DEFAULT NULL COMMENT '排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数',
    `is_parent`  tinyint(1)  DEFAULT '1' COMMENT '该类目是否为父类目，1为true，0为false',
    `created`    datetime    DEFAULT NULL COMMENT '创建时间',
    `updated`    datetime    DEFAULT NULL COMMENT '创建时间',
    PRIMARY KEY (`id`),
    KEY `parent_id` (`parent_id`, `status`) USING BTREE,
    KEY `sort_order` (`sort_order`)
) AUTO_INCREMENT = 98
  DEFAULT CHARSET = utf8 COMMENT ='内容分类';