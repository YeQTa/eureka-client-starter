package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SimpleEurekaClient1Application {

  public static void main(String[] args) {
    SpringApplication.run(SimpleEurekaClient1Application.class, args);
  }

}
