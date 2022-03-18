package com.example.openfeign.service;

import com.example.openfeign.model.Post;
import java.util.List;

public interface PostService {

	List<Post> getAllPosts();
}
