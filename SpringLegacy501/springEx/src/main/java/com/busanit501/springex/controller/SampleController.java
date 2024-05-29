package com.busanit501.springex.controller;

import jdk.internal.vm.annotation.Contended;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class SampleController {

  @GetMapping("/hello")
  public void helloTest() {

    log.info("Hello World! Spring");
  }
}







