package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    List<Post> getAllPosts();
    void addPost(Post newPost);
    Post getPostById(Long id);
    void downVote(Long PostId);
    void upVote(Long PostId);
}
