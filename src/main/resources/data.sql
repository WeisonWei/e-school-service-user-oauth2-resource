delete from `tb_content`;
delete from `tb_content_category`;

insert into `tb_content`(`id`, `category_id`, `title`, `sub_title`, `title_desc`, `url`, `pic`, `pic2`, `content`)
values (28, 89, '标题', '子标题', '标题说明', 'http://www.jd.com', NULL, NULL, NULL),
       (29, 89, 'ad2', 'ad2', 'ad2', 'http://www.baidu.com', NULL, NULL, NULL),
       (30, 89, 'ad3', 'ad3', 'ad3', 'http://www.sina.com.cn', NULL, NULL, NULL),
       (31, 89, 'ad4', 'ad4', 'ad4', 'http://www.funtl.com', NULL, NULL, NULL);

insert into `tb_content_category`(`id`, `parent_id`, `name`, `status`, `sort_order`, `is_parent`)
values (30, 0, 'LeeShop', 1, 1, 1),
       (86, 30, '首页', 1, 1, 1),
       (87, 30, '列表页面', 1, 1, 1),
       (88, 30, '详细页面', 1, 1, 1),
       (89, 86, '大广告', 1, 1, 0),
       (90, 86, '小广告', 1, 1, 0),
       (91, 86, '商城快报', 1, 1, 0),
       (92, 87, '边栏广告', 1, 1, 0),
       (93, 87, '页头广告', 1, 1, 0),
       (94, 87, '页脚广告', 1, 1, 0),
       (95, 88, '边栏广告', 1, 1, 0),
       (96, 86, '中广告', 1, 1, 1),
       (97, 96, '中广告1', 1, 1, 0);