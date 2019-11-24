package com.retake.filmography.docker.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/docker/hello")
public class ResourceClass {

    @GetMapping
    public String hello(){
        return "Hello";
    }
}
