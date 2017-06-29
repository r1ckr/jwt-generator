package com.r1ckr.jwtgenerator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JwtGeneratorApplication {

	@Value("${jwt.secret}")
	private String jwtSecret;
	@Value("${jwt.issuer}")
	private String jwtIssuer;

	public static void main(String[] args) {
		SpringApplication.run(JwtGeneratorApplication.class, args);
	}

	@Bean
	public JwtTokenGenerator jwtTokenGenerator(){
		return new JwtTokenGenerator(jwtSecret, jwtIssuer);
	}
}
