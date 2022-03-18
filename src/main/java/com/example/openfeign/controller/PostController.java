package com.example.openfeign.controller;

import com.example.openfeign.model.Post;
import com.example.openfeign.service.PostService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("posts")
@RequiredArgsConstructor
public class PostController {

	private final PostService service;


	@GetMapping
	ResponseEntity<List<Post>> allPosts() {
		List<Post> allPosts = service.getAllPosts();

		return ResponseEntity.ok(allPosts);
	}
}
