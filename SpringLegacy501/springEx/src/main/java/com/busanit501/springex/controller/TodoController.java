package com.busanit501.springex.controller;

import com.busanit501.springex.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {
    @RequestMapping("/list")
    public void listTest() {
        log.info("todo list 조회 화면 테스트 콘솔");
    }
    @GetMapping("/register")
    public void registerGetTest() {
        log.info("todo register 등록 화면 Get  테스트 콘솔");
    }

    @PostMapping("/register")
    public void registerPostTest(TodoDTO todoDTO) {
        log.info("todo register 등록 화면 Post 테스트 콘솔");
        log.info("TodoDTO 타입 0차 테스트 : " + todoDTO);
    }

    @GetMapping("/ex1")
    public void ex1Test(String name, int age) {
        log.info("name : " + name + " age : " + age);
    }

    @GetMapping("/ex2")
    public void ex1Test2(@RequestParam(name = "name", defaultValue = "default lsy") String name, int age) {
        log.info("default name : " + name + " age : " + age);
    }

    @GetMapping("/ex3")
    public void ex1Test3(LocalDate dueDate) {
        log.info("ex3 test");
        log.info("LocalDate 타입 1차 테스트 : " + dueDate);
    }

    @PostMapping("/ex4")
    public void ex1Test4(TodoDTO todoDTO) {
        log.info("ex4 test");
        log.info("TodoDTO 타입 1차 테스트 : " + todoDTO);
    }
}
