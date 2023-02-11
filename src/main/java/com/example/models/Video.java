package com.example.models;

import java.util.List;

import java.util.Set;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="Video")
public class Video {
	
	@Id
	private String id;
	private String title;
	private String description;
	private Integer userId;
	private Integer likes;
	private Integer disLikes;
	private Set<String> tags;
	private String videoUrl;
	private VideoStatus videoStatus;
	private Integer viewCount;
	private String thumbnailUrl;
	private List<Comment> commentList;
	
	
	public Video() {
		super();
	}


	public Video(String id, String title, String description, Integer userId, Integer likes, Integer disLikes,
			Set<String> tags, String videoUrl, VideoStatus videoStatus, Integer viewCount, String thumbnailUrl,
			List<Comment> commentList) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.userId = userId;
		this.likes = likes;
		this.disLikes = disLikes;
		this.tags = tags;
		this.videoUrl = videoUrl;
		this.videoStatus = videoStatus;
		this.viewCount = viewCount;
		this.thumbnailUrl = thumbnailUrl;
		this.commentList = commentList;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public Integer getLikes() {
		return likes;
	}


	public void setLikes(Integer likes) {
		this.likes = likes;
	}


	public Integer getDisLikes() {
		return disLikes;
	}


	public void setDisLikes(Integer disLikes) {
		this.disLikes = disLikes;
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


	public Integer getViewCount() {
		return viewCount;
	}


	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}


	public String getThumbnailUrl() {
		return thumbnailUrl;
	}


	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}


	public List<Comment> getCommentList() {
		return commentList;
	}


	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}


	@Override
	public String toString() {
		return "Video [id=" + id + ", title=" + title + ", description=" + description + ", userId=" + userId
				+ ", likes=" + likes + ", disLikes=" + disLikes + ", tags=" + tags + ", videoUrl=" + videoUrl
				+ ", videoStatus=" + videoStatus + ", viewCount=" + viewCount + ", thumbnailUrl=" + thumbnailUrl
				+ ", commentList=" + commentList + "]";
	}
	
	
	
	
	

	
	
	
	
	
	
		

}
