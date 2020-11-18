package com.example.microservice.api;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserControllerTest {
	
	private String uri;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Before
	public void init() {
		uri = "/v1/user/";
	}
	
	@Test
	public void userMissingParameter() {
		ResponseEntity<String> respuesta =
				restTemplate.getForEntity(uri , String.class);
		assertThat(respuesta.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
	}
	
	@Test
	public void getUser() {
		ResponseEntity<String> respuesta =
				restTemplate.getForEntity(uri + "/?id=w", String.class);
		assertThat(respuesta.getStatusCode()).isEqualTo(HttpStatus.OK);
	}
	
}
