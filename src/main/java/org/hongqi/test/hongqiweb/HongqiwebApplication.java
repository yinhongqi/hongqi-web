package org.hongqi.test.hongqiweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HongqiwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(HongqiwebApplication.class, args);
    }


    @GetMapping("")
    public String index() {
        return "welcome to index";
    }
}
