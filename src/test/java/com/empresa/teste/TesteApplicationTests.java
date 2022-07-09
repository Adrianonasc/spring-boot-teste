package com.empresa.teste;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class TesteApplicationTests {

	@Autowired
  private LociRepository repository;

	@Value("${variavel.teste}") 
	private String dbUrl;

	@Test
	void contextLoads() {
		System.out.println(dbUrl);
		assertTrue(dbUrl.trim().equalsIgnoreCase("teste_prop"), dbUrl);
		assertTrue(repository.count() == 0);
	}

}
