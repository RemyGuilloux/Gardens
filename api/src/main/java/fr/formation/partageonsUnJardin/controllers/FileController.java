package fr.formation.partageonsUnJardin.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.HttpStatus;

import fr.formation.partageonsUnJardin.services.FileService;

public class FileController {
	
	private final FileService fileService;
	 
	@Autowired
	public FileController(FileService fileService) {
		this.fileService = fileService;
	}
 
	@PostMapping(value = "/files")
	@ResponseStatus(HttpStatus.OK)
	public void handleFileUpload(@RequestParam("file") MultipartFile file) throws IOException {
		fileService.storeFile(file);
	}

}
