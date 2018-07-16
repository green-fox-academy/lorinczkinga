package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.Posts;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    private final
    PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public Posts getPostList() {
        return new Posts(postService.getAllPosts());
    }

    @PostMapping("/posts")
    public Post addPost(@RequestBody Post newPost) {
        postService.addPost(newPost);
        return newPost;
    }

    @PutMapping("/posts/{id}/downvote")
    public Post downVote(@PathVariable(name="id") Long PostId) {
        postService.downVote(PostId);
        return postService.getPostById(PostId);
    }

    @PutMapping("/posts/{id}/upvote")
    public Post upVote(@PathVariable(name="id") Long PostId) {
        postService.upVote(PostId);
        return postService.getPostById(PostId);
    }
}
