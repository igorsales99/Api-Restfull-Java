package com.igorsales.demo.repository;

import com.igorsales.demo.domain.Post;
import com.igorsales.demo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
