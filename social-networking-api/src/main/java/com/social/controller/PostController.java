package com.social.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.demo.entity.Post;

import java.util.Arrays;
import java.util.List;

@RestController
public class PostController {

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return Arrays.asList(
            new Post(1, "Hello world", 1),
            new Post(2, "This is my first post", 2)
        );
    }
}
