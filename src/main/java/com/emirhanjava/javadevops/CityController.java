package com.emirhanjava.javadevops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cities")
public class CityController {

    @GetMapping("/city")
    public String getCıty(){
        return "İstanbul";
    }

}
