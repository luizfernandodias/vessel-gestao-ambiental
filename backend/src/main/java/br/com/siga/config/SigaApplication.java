package br.com.siga.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableConfigurationProperties
@EnableResourceServer
@EnableAutoConfiguration
@EntityScan(basePackages = {"br.com.siga.entity"})
@ComponentScan(basePackages = {"br.com.siga.components","br.com.siga.service","br.com.siga.config",
		"br.com.siga.controller"})
@EnableJpaRepositories(basePackages = {"br.com.siga.repository"})
public class SigaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigaApplication.class, args);
	}

}
