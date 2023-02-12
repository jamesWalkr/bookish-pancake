package com.example.services;

import java.io.IOException;


import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;

@Service
public class S3Service implements FileService {
	
	public static final String BUCKET_NAME = "vidclone";
	
	private final AmazonS3Client awsS3Client;
	
	//@Autowired
	public S3Service(AmazonS3Client awsS3Client) {
		this.awsS3Client = awsS3Client; 
	}

	@Override
	public String uploadFile(MultipartFile file) {
		
		
		//Prepare a Key 
		var filenameExtension =  StringUtils.getFilename(file.getOriginalFilename());
		
		var key = UUID.randomUUID().toString() + "." + filenameExtension; 
		
		var metadata = new ObjectMetadata();
		
		metadata.setContentLength(file.getSize());
		
		metadata.setContentType(file.getContentType());
		
		
		try {
			
			awsS3Client.putObject(BUCKET_NAME, key, file.getInputStream(), metadata);
			
		}catch(IOException ioException){
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "An exception occured while uploading the file");
			
		}
		
		 awsS3Client.setObjectAcl(BUCKET_NAME, key, CannedAccessControlList.PublicRead);
		 
		 
		return awsS3Client.getResourceUrl(BUCKET_NAME, key);
	}
	
	

}
