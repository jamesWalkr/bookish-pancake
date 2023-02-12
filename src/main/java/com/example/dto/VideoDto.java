package com.example.dto;

import java.util.Set;

import com.example.models.VideoStatus;

public class VideoDto {
	private String id;
	private String titile;
	private String description;
	private Set<String> tags;
	private String videoUrl;
	private VideoStatus videoStatus;
	private String thumbnailUrl;
	
	
	public VideoDto() {
		super();
	}


	public VideoDto(String id, String titile, String description, Set<String> tags, String videoUrl,
			VideoStatus videoStatus, String thumbnailUrl) {
		super();
		this.id = id;
		this.titile = titile;
		this.description = description;
		this.tags = tags;
		this.videoUrl = videoUrl;
		this.videoStatus = videoStatus;
		this.thumbnailUrl = thumbnailUrl;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitile() {
		return titile;
	}


	public void setTitile(String titile) {
		this.titile = titile;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Set<String> getTags() {
		return tags;
	}


	public void setTags(Set<String> tags) {
		this.tags = tags;
	}


	public String getVideoUrl() {
		return videoUrl;
	}


	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}


	public VideoStatus getVideoStatus() {
		return videoStatus;
	}


	public void setVideoStatus(VideoStatus videoStatus) {
		this.videoStatus = videoStatus;
	}


	public String getThumbnailUrl() {
		return thumbnailUrl;
	}


	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}


	@Override
	public String toString() {
		return "VideoDto [id=" + id + ", titile=" + titile + ", description=" + description + ", tags=" + tags
				+ ", videoUrl=" + videoUrl + ", videoStatus=" + videoStatus + ", thumbnailUrl=" + thumbnailUrl + "]";
	}
	
	
	
	
	
	
	
	

}
