package com.example.dto;


public class UploadVideoResponse {
	
	private String videoId;
	private String videoUrl;
	
	
	public UploadVideoResponse() {
		super();
	}


	public UploadVideoResponse(String videoId, String videoUrl) {
		super();
		this.videoId = videoId;
		this.videoUrl = videoUrl;
	}


	public String getVideoId() {
		return videoId;
	}


	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}


	public String getVideoUrl() {
		return videoUrl;
	}


	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}


	@Override
	public String toString() {
		return "VideoResponseDto [videoId=" + videoId + ", videoUrl=" + videoUrl + "]";
	}
	
	
	
	
	
	

}
