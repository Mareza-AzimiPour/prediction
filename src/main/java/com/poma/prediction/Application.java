package com.poma.prediction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    SpringApplication.run(Application.class, args);
    long end = System.currentTimeMillis();
    double seconds = (end - start) / 1000.0;
    System.out.println("Total GraalVM process startup time: " + seconds + " seconds");
  }
}
