package com.es.user.resource.service;

import com.es.user.resource.repository.ContentCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContentCategoryService {

    @Autowired
    private ContentCategoryRepository contentCategoryRepository;

}
