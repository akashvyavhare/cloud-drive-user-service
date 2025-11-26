package com.clouddrive.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI openAPI() {
		Server server = new Server();
		server.setUrl("http://localhost:8090/");
		server.setDescription("Local Host Server");
		return new OpenAPI().servers(List.of(server));
	}
	
}
