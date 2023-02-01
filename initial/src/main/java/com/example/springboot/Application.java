package com.example.springboot;

import com.google.common.flogger.FluentLogger;
import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(Application.class, args);

    logger.atInfo().log("Let's inspect the beans provided by Spring Boot:");

    String[] beanNames = ctx.getBeanDefinitionNames();
    Arrays.sort(beanNames);
    for (String beanName : beanNames) {
      logger.atInfo().log("beanNae: %s", beanName);
    }
  }
}
