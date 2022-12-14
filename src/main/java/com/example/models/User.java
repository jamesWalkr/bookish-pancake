package com.example.models;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="full_name")
	private String fullName;
	
	
	private String email;
	
	@Column(name="subscribed_to_users")
	private Set<String> subscribedToUsers;
	
	
	private Set<String> subscribers;
	
	@Column(name="video_history")
	private List<String> videoHistory;
	
	@Column(name="liked_videos")
	private Set<String> likedVideos;
	
	@Column(name="disliked_vidoes")
	private Set<String> disLikedVideos;

	
	
	
	
	public User() {
		super();
	}





	public User(Integer id, String firstName, String lastName, String fullName, String email,
			Set<String> subscribedToUsers, Set<String> subscribers, List<String> videoHistory, Set<String> likedVideos,
			Set<String> disLikedVideos) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.email = email;
		this.subscribedToUsers = subscribedToUsers;
		this.subscribers = subscribers;
		this.videoHistory = videoHistory;
		this.likedVideos = likedVideos;
		this.disLikedVideos = disLikedVideos;
	}





	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
	}





	public String getFirstName() {
		return firstName;
	}





	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}





	public String getLastName() {
		return lastName;
	}





	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	public String getFullName() {
		return fullName;
	}





	public void setFullName(String fullName) {
		this.fullName = fullName;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public Set<String> getSubscribedToUsers() {
		return subscribedToUsers;
	}





	public void setSubscribedToUsers(Set<String> subscribedToUsers) {
		this.subscribedToUsers = subscribedToUsers;
	}





	public Set<String> getSubscribers() {
		return subscribers;
	}





	public void setSubscribers(Set<String> subscribers) {
		this.subscribers = subscribers;
	}





	public List<String> getVideoHistory() {
		return videoHistory;
	}





	public void setVideoHistory(List<String> videoHistory) {
		this.videoHistory = videoHistory;
	}





	public Set<String> getLikedVideos() {
		return likedVideos;
	}





	public void setLikedVideos(Set<String> likedVideos) {
		this.likedVideos = likedVideos;
	}





	public Set<String> getDisLikedVideos() {
		return disLikedVideos;
	}





	public void setDisLikedVideos(Set<String> disLikedVideos) {
		this.disLikedVideos = disLikedVideos;
	}





	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", fullName=" + fullName
				+ ", email=" + email + ", subscribedToUsers=" + subscribedToUsers + ", subscribers=" + subscribers
				+ ", videoHistory=" + videoHistory + ", likedVideos=" + likedVideos + ", disLikedVideos="
				+ disLikedVideos + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
