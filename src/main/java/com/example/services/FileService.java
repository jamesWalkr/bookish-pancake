package com.example.services;

import org.springframework.web.multipart.MultipartFile;



public interface FileService {
	
	String uploadFile(MultipartFile file);

}
