package com;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class EmployeeConfig {
	@Bean
	public Scanner scannerBean1() {
		return new Scanner(System.in);
	}
	@Bean
	@Primary
	public Scanner scannerBean2() {
		return new Scanner(System.in);
	}
}


