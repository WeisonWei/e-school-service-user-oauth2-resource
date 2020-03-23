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
@Table(name = "tb_content_category", indexes = @Index(name = "idx_parent_id", columnList = "parent_id"))
public class ContentCategory extends BaseEntity {

    @Builder.Default
    @Column(name = "parent_id", nullable = true, columnDefinition = BIGINT_DEFAULT_0)
    private Long parentId = null;

    @Builder.Default
    @Column(name = "name", nullable = true, columnDefinition = VARCHAR_DEFAULT_0)
    private String name = null;

    @Builder.Default
    @Column(name = "status", nullable = true, columnDefinition = INT_DEFAULT_0)
    private Integer status = null;

    @Builder.Default
    @Column(name = "sort_order", nullable = true, columnDefinition = INT_DEFAULT_0)
    private Integer sortOrder = null;

    @Builder.Default
    @Column(name = "is_parent", nullable = true, columnDefinition = VARCHAR_DEFAULT_0)
    private String isParent = null;


}

