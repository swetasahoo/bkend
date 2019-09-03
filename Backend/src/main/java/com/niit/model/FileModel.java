package com.niit.model;

import org.springframework.web.multipart.MultipartFile;
import java.io.File;

public class FileModel {

	private MultipartFile file;

	   public MultipartFile getFile() {
	      return file;
	   }

	   public void setFile(MultipartFile file) {
	      this.file = file;
	   }
	
	
	
	
}
