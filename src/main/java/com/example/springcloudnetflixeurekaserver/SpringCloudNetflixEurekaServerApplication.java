package com.example.springcloudnetflixeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer /* 유레카 서버 선언 어노테이션 */
public class SpringCloudNetflixEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudNetflixEurekaServerApplication.class, args);
	}

}
