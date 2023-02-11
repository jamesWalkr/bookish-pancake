package com.example.models;

import org.springframework.data.annotation.Id;

public class Comment {
	
	@Id
	private Integer id;
	private String text;
	private Integer authorId;
	private Integer likeCount;
	private Integer dislikeCount;

	
	public Comment() {
		super();
	}


	public Comment(Integer id, String text, Integer authorId, Integer likeCount, Integer dislikeCount) {
		super();
		this.id = id;
		this.text = text;
		this.authorId = authorId;
		this.likeCount = likeCount;
		this.dislikeCount = dislikeCount;
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getText() {
		return text;
	}




	public void setText(String text) {
		this.text = text;
	}




	public Integer getAuthorId() {
		return authorId;
	}




	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}




	public Integer getLikeCount() {
		return likeCount;
	}




	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}




	public Integer getDislikeCount() {
		return dislikeCount;
	}




	public void setDislikeCount(Integer dislikeCount) {
		this.dislikeCount = dislikeCount;
	}




	@Override
	public String toString() {
		return "Comment [id=" + id + ", text=" + text + ", authorId=" + authorId + ", likeCount=" + likeCount
				+ ", dislikeCount=" + dislikeCount + "]";
	}
	
	
	
	
	
	
	
	

}
