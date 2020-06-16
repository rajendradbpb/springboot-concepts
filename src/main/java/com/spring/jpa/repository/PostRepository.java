package com.spring.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.entity.PostEntity;
import com.spring.jpa.entity.UserEntity;

@Repository
public interface PostRepository extends CrudRepository<PostEntity, Long> {

	

}
