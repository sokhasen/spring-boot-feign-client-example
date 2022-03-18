package com.example.openfeign.service;

import com.example.openfeign.client.PostJsonPlaceholderClient;
import com.example.openfeign.model.Post;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

	private final PostJsonPlaceholderClient client;


	@Override
	public List<Post> getAllPosts() {
		return client.getAllPosts();
	}
}
