package com.social.demo.posts;

import com.social.demo.users.User;

public class Post {
    private String id;
    private String postDate;
    private User user;
    private String details;

    public Post(String id, String postDate, User user, String details) {
        this.id = id;
        this.postDate = postDate;
        this.user = user;
        this.details = details;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPostDate() { return postDate; }
    public void setPostDate(String postDate) { this.postDate = postDate; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
}
