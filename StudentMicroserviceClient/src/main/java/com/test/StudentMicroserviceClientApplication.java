package com.test;

import com.test.repository.RemoteStudentRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentMicroserviceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMicroserviceClientApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
	
	@Bean
	public RemoteStudentRepository remoteStudentRepository()
	{
		return new RemoteStudentRepository();
	}
}
