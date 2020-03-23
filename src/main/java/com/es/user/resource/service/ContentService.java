package com.es.user.resource.service;

import com.es.user.resource.entity.Content;
import com.es.user.resource.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {

    @Autowired
    private ContentRepository contentRepository;

    public List<Content> getContentList() {
        return contentRepository.findAll();
    }

    public Content update(Content content) {
        return contentRepository.save(content);
    }

    public Content getById(Long id) {
        return contentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("资源不存在"));
    }


    public void deleteById(Long id) {
        contentRepository.deleteById(id);
    }

}
