package com.es.user.resource.repository;

import com.es.user.resource.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContentRepository extends JpaRepository<Content, Long>, CrudRepository<Content, Long> {

    Optional<Content> findByTitle(String title);

}
