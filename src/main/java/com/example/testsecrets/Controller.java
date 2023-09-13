package com.example.testsecrets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping(value = "/path")
  public String endpoint() {
    return "asd";
  }
}
