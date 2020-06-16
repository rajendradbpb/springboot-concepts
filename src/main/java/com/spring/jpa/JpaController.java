package com.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.jpa.entity.PostEntity;
import com.spring.jpa.entity.UserEntity;
import com.spring.jpa.repository.PostRepository;
import com.spring.jpa.repository.UserRepository;

@RestController
public class JpaController {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	PostRepository postRepo;
	
	@PostMapping("/user")
	public ResponseEntity<?> creatUser(@RequestBody UserEntity user) {
		// saving the user
		userRepo.save(user);
		return new ResponseEntity<UserEntity>(user, HttpStatus.CREATED);
	}
	
	@PostMapping("/posts")
	public ResponseEntity<?> createPost(@RequestBody PostRequest post) {
		// saving the post
		PostEntity postEntity = new PostEntity(post.getPostname());
		UserEntity user = userRepo.findById(post.getUserId()).get();
		postEntity.setUser(user);
		postRepo.save(postEntity);
		return new ResponseEntity<PostEntity>(postEntity, HttpStatus.CREATED);
	}
	
	
	public static class PostRequest{
		private String postname;
		private Long userId;
		public String getPostname() {
			return postname;
		}
		public void setPostname(String postname) {
			this.postname = postname;
		}
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		
	}
	
}
