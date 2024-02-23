package com.HELLOW.HRLLOWORLD;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellowworld {
    @GetMapping("/hello")
    public String hello(){
        return "hello world ";
    }
}



