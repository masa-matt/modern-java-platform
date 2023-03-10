package com.example.springboot;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest {
  @Autowired private transient MockMvc mvc;

  @Test
  void getHello() {
    assertDoesNotThrow(
        () ->
            mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(
                    MockMvcResultMatchers.content()
                        .string(Matchers.equalTo("Greetings from Spring Boot!"))));
  }
}
