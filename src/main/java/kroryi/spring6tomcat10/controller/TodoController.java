package kroryi.spring6tomcat10.controller;


import kroryi.spring6tomcat10.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {
    @RequestMapping("/list")
    public void list() {
        log.info("list_________");
    }

    @GetMapping("/register")
    public void registerGet() {
        log.info("register GET_________");
    }

 /*@PostMapping("/register")
    public void registerPost(TodoDTO todoDTO){
     log.info("register POST_________");
     log.info(todoDTO);
 }*/

    @PostMapping("/register-views")
    public void registerviews(@ModelAttribute("dto") TodoDTO todoDTO, Model model) {
        log.info("register VIEW_________");
        log.info(todoDTO);
        model.addAttribute("todo", todoDTO);
    }


}
