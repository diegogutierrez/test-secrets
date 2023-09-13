package com.example.testsecrets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  private final DbConfig dbConfig;

  public Controller(DbConfig dbConfig) {
    this.dbConfig = dbConfig;
  }

  @GetMapping(value = "/path")
  public String endpoint() {
    return "asd";
  }
}
