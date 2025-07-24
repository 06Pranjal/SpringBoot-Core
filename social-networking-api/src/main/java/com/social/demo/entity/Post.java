package com.social.demo.entity;


public class Post {
    private int postId;
    private String content;
    private int userId;

    public Post(int postId, String content, int userId) {
        this.postId = postId;
        this.content = content;
        this.userId = userId;
    }

    public Post() {}

    public int getPostId() { return postId; }
    public void setPostId(int postId) { this.postId = postId; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
}
