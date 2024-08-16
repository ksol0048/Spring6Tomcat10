package kroryi.spring6tomcat10.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@Log4j2
public class SampleController {
    @GetMapping("/hello")
    public void hello() {
        log.info("hello____________________________");
    }

    @GetMapping("/ex1")
    public void ex1(@RequestParam("name") String name, @RequestParam("age") int age) {
        // @RequestParam Spring 6ver, Spring boot 3.2ver 부터 사용해야함...
        log.info("ex1____________________________");
        log.info("name:{}", name);
        log.info("age:{}", age);
    }

    @GetMapping("/ex2")
    public void ex2(@RequestParam("dueDate") LocalDate dueDate){
        log.info("ex2____________________________");
        log.info("dueDate:{}", dueDate);
    }
}
