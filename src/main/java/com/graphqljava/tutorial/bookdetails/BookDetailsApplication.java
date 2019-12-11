package com.graphqljava.tutorial.bookdetails;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@MapperScan("com.graphqljava.tutorial.bookdetails.mapper")
public class BookDetailsApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(BookDetailsApplication.class, args);
	}

}
