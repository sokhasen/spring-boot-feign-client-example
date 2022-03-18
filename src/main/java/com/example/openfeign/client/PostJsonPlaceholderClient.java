package com.example.openfeign.client;

import com.example.openfeign.model.Post;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "posts", url = "${spring.client.json-placeholder-url}")
public interface PostJsonPlaceholderClient {

	@GetMapping("posts")
	List<Post> getAllPosts();
}
