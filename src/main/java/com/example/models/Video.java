package com.example.models;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="video")
public class Video {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String title;
	
	private String description;
	
	@Column(name="user_id")
	private Integer userId;
	
	private Integer likes;
	
	private Integer disLikes;
	
	private Set<String> tags;
	
	@Column(name="video_url")
	private String videoUrl;
	
	@Column(name="video_status")
	private VidoeStatus videoStatus;
	
	@Column(name="view_count")
	private Integer viewCount;
	
	@Column(name="comment_list")
	@OneToMany(cascade = CascadeType.ALL)
	private List<Comment> commentList;
	
	
	
	public Video() {
		super();
	}



	public Video(Integer id, String title, String description, Integer userId, Integer likes, Integer disLikes,
			Set<String> tags, String videoUrl, VidoeStatus videoStatus, Integer viewCount, List<Comment> commentList) {
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
		this.commentList = commentList;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
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



	public VidoeStatus getVideoStatus() {
		return videoStatus;
	}



	public void setVideoStatus(VidoeStatus videoStatus) {
		this.videoStatus = videoStatus;
	}



	public Integer getViewCount() {
		return viewCount;
	}



	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
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
				+ ", viewCount=" + viewCount + "]";
	}
	
	
	
	
	
	
		

}
