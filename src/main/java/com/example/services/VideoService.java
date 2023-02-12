package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.dto.UploadVideoResponse;
import com.example.dto.VideoDto;
import com.example.models.Video;
import com.example.repo.VideoRepository;

@Service
public class VideoService {
	
	private final S3Service s3Service;
	private final VideoRepository videoRepo;
	
	
	//@Autowired
	public VideoService(S3Service s3Service, VideoRepository videoRepo) {
		this.s3Service = s3Service;
		this.videoRepo = videoRepo;
	}
	
	public UploadVideoResponse uploadVideo(MultipartFile multipartfile) {
		
		String videoUrl = s3Service.uploadFile(multipartfile);
			
		var video = new Video();
		
		video.setVideoUrl(videoUrl);
		
		var savedVideo = videoRepo.save(video);
		
		return new UploadVideoResponse(savedVideo.getId(), savedVideo.getVideoUrl());
			
	}
	
	public VideoDto editVideo(VideoDto videoDto) {
		
		//Find the video by videoId
		var savedVideo = getVideoById(videoDto.getId());
		
		//Video savedVideo = videoRepo.findById(videoDto.getId()).orElseThrow(() -> new IllegalArgumentException("Cannot find video by id - " + videoDto.getId()));
		
		
		//Map videoDto fields to video
		savedVideo.setTitle(videoDto.getTitile());
		savedVideo.setDescription(videoDto.getDescription());
		savedVideo.setTags(videoDto.getTags());
		savedVideo.setThumbnailUrl(videoDto.getThumbnailUrl());
		savedVideo.setVideoStatus(videoDto.getVideoStatus());
		
		
		//save video to the database
		videoRepo.save(savedVideo);
		
		return videoDto;
	}
	
	public String uploadThumbnail(MultipartFile file, String videoId) {
		
		var savedVideo = getVideoById(videoId);
		
		String thumbnailUrl = s3Service.uploadFile(file);
		
		savedVideo.setThumbnailUrl(thumbnailUrl);
		
		videoRepo.save(savedVideo);
		
		return thumbnailUrl;
		
		
		
	}
	
	Video getVideoById(String videoId) {
		return videoRepo.findById(videoId).orElseThrow(() -> new IllegalArgumentException("Cannot find video by id - " + videoId));
	}
		
	
	
	
	
}


