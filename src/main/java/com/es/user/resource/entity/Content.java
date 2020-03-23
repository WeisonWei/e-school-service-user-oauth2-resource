package com.es.user.resource.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;


@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DynamicUpdate(true)
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_content", indexes = @Index(name = "idx_category_id", columnList = "category_id"))
public class Content extends BaseEntity {

    @Builder.Default
    @Column(name = "category_id", nullable = true, columnDefinition = BIGINT_DEFAULT_0)
    private Long categoryId = null;

    @Builder.Default
    @Column(name = "title", nullable = true, columnDefinition = VARCHAR_DEFAULT_0)
    private String title = null;

    @Builder.Default
    @Column(name = "sub_title", nullable = true, columnDefinition = VARCHAR_DEFAULT_0)
    private String subTitle = null;

    @Builder.Default
    @Column(name = "title_desc", nullable = true, columnDefinition = VARCHAR_DEFAULT_0)
    private String titleDesc = null;

    @Builder.Default
    @Column(name = "url", nullable = true, columnDefinition = VARCHAR_DEFAULT_0)
    private String url = null;

    @Builder.Default
    @Column(name = "pic", nullable = true, columnDefinition = VARCHAR_DEFAULT_0)
    private String pic = null;

    @Builder.Default
    @Column(name = "pic2", nullable = true, columnDefinition = VARCHAR_DEFAULT_0)
    private String pic2 = null;

    @Builder.Default
    @Column(name = "content", nullable = true, columnDefinition = VARCHAR_DEFAULT_0)
    private String content = null;

}


