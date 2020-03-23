package com.es.user.resource.controller;

import com.es.user.resource.entity.Content;
import com.es.user.resource.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ContentController {

    @Autowired
    private ContentService contentService;

    @GetMapping("/")
    public ResponseEntity<List<Content>> selectAll() {
        return new ResponseEntity<>(contentService.getContentList(), HttpStatus.OK);
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<Content> getById(@PathVariable Long id) {
        return new ResponseEntity<>(contentService.getById(id), HttpStatus.OK);
    }

    @PostMapping("/insert")
    public ResponseEntity<Integer> insert(@RequestBody Content Content) {
        return new ResponseEntity(contentService.update(Content), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Integer> update(@RequestBody Content Content) {
        return new ResponseEntity(contentService.update(Content), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        contentService.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
