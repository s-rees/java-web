package com.example.demo;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void GetRequestTest() {
        ResponseEntity<String> response = restTemplate
                .withBasicAuth("scottrees", "pass")
                .getForEntity("/", String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo("Hello World");
    }

    @Test
    void HomeGetRequestTest() {
        ResponseEntity<String> response = restTemplate
                .getForEntity("/home", String.class);

        DocumentContext documentContext = JsonPath.parse(response.getBody());
        String name = documentContext.read("$.[0].name");
        assertThat(name).isEqualTo("Scott Rees");

        Integer amount = documentContext.read("$.[0].age");
        assertThat(amount).isEqualTo(26);
    }

}
