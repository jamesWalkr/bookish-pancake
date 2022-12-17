package com.example.services;

import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;

//import com.amazonaws.services.s3.AmazonS3Client;

@Service
public class S3Service implements FileService {
	
	public static final String BUCKET_NAME = "vidclone";
	//private final AmazonS3Client awsS3Client = new AmazonS3Client();

	@Override
	public String uploadFile(MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
