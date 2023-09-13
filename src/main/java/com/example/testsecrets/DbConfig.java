package com.example.testsecrets;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {

  @Value("${myusername:invalid}")
  private String myusername;
}
