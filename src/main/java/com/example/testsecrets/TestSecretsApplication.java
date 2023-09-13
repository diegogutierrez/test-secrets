package com.example.testsecrets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSecretsApplication {

  public static void main(String[] args) {

    final var a = 1;
    SpringApplication.run(TestSecretsApplication.class, args);
  }

}
