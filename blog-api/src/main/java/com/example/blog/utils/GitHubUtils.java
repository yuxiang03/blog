package com.example.blog.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class GitHubUtils {
    public static final String url = "http://127.0.0.1:36677/upload";

    public boolean upload(MultipartFile file,String filename){

        return false;
    }
}
