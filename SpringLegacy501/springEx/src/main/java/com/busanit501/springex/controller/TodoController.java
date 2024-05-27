package com.busanit501.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {
    @RequestMapping("/list")
    public void listTest() {
        log.info("todo list 조회 화면 테스트 콘솔");
    }
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public void registerTest() {
        log.info("todo register 등록 화면 테스트 콘솔");
    }
}
