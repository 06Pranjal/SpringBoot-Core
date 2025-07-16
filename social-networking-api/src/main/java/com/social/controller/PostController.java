package com.social.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.services.PostService;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/post")
    public String getUser() {
        return postService.getUser();
    }
}
