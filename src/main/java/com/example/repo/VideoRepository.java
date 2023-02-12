package com.example.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Video;

@Repository
public interface VideoRepository extends MongoRepository <Video, String> {

}
