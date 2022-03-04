package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZullserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZullserverApplication.class, args);
	}

}
