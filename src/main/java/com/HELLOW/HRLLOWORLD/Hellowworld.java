package com.HELLOW.HRLLOWORLD;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;

@RestController
public class Hellowworld {
    @GetMapping("/hello")
    public String hello(){
        LocalDate date = LocalDate.now();
        return "hello world " + date;
    }
}
