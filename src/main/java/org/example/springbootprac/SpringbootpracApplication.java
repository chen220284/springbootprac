package org.example.springbootprac;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.springbootprac.mapper")
public class SpringbootpracApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootpracApplication.class, args);
	}

}
