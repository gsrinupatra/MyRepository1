package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nit.utils.PwdUtils;

@SpringBootApplication
public class BootProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootProject1Application.class, args);
	}
		@Bean
		public PwdUtils getInstance() {
			return new PwdUtils();
		}



}
