package com.es.user.resource.repository;

import com.es.user.resource.entity.ContentCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentCategoryRepository extends JpaRepository<ContentCategory, Long>, CrudRepository<ContentCategory, Long> {

    List<ContentCategory> findByParentId(Long parentId);

}
