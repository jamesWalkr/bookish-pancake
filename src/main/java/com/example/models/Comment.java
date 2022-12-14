package com.example.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="commment")
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;
	
	
	private String text;
	
	
	@Column(name="author_id")
	private Integer authorId;
	
	@Column(name="like_count")
	private Integer likeCount;
	
	@Column(name="dislike_count")
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
