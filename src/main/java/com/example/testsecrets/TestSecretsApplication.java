package com.example.testsecrets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSecretsApplication {

  public static void main(String[] args) throws InterruptedException {

    final var a = 1;
    Thread.sleep(10000);
    SpringApplication.run(TestSecretsApplication.class, args);
  }

}
