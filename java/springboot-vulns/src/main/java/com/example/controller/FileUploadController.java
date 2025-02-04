package com.example.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/file")
public class FileUploadController {
    @RequestMapping(value = "/upload")
    public String parseJson(@RequestParam("file") MultipartFile file) {
		  return file.getOriginalFilename();
    }
}
