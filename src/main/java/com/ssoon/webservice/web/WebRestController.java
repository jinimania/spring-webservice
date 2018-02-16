package com.ssoon.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

  @GetMapping(value = "/hello")
  public String hello() {
    return "Hello World";
  }
}
