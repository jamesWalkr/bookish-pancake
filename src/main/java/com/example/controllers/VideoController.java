package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.dto.UploadVideoResponse;
import com.example.dto.VideoDto;
import com.example.services.VideoService;

@RestController
@RequestMapping("/api/videos")
public class VideoController {
	
	private final VideoService videoService;
	
	//@Autowired
	public VideoController(VideoService videoService) {
		this.videoService = videoService;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UploadVideoResponse uploadVideo(@RequestParam("file")MultipartFile file) {
		
		return videoService.uploadVideo(file);
		
	}
	@PostMapping("/thumbnail")
	@ResponseStatus(HttpStatus.OK)
	public String uploadThumbnail(@RequestParam("file") MultipartFile file, @RequestParam("videoId") String videoId) {
		
		return videoService.uploadThumbnail(file, videoId);
		
	}
	
	@PutMapping 
	@ResponseStatus(HttpStatus.OK)
	public VideoDto editVideoMetadata(@RequestBody VideoDto videoDto ){
		
		return videoService.editVideo(videoDto);
	}

}
