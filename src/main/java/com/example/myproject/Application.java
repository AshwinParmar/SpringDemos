package com.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
    }
    
    @Override
    public void run(String... args) {
      System.out.println("Args: ");
    }
    
    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
      return new ExitCodeGenerator() {
        @Override
        public int getExitCode() {
          return 42;
        }
      };
    }

}