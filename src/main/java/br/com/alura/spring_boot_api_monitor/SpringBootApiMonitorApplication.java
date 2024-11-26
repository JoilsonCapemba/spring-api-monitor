package br.com.alura.spring_boot_api_monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

//Esatas configurações ou anotações são para habilitar o admin das apis

@SpringBootApplication
@EnableAdminServer
@Configuration
public class SpringBootApiMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiMonitorApplication.class, args);
	}

}
