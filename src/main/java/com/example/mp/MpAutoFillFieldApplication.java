package com.example.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.mp.mapper")
public class MpAutoFillFieldApplication {

	public static void main(String[] args) {
		SpringApplication.run(MpAutoFillFieldApplication.class, args);
	}

}
