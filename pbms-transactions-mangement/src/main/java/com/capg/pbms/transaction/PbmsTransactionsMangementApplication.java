package com.capg.pbms.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class PbmsTransactionsMangementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PbmsTransactionsMangementApplication.class, args);
	}

	@Bean
	@LoadBalanced

	public RestTemplate getRestTemplate() {
		return new RestTemplate();

	}

}
