package sample.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication //spring boot, auto config, and external variables (use @Value)
@EnableAutoConfiguration
@EnableEurekaClient
@EnableZuulProxy

public class ZuulGateway {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZuulGateway.class, args);
	}

}
