package br.com.devjavagirl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.devjavagirl.controller.SharedController;
import br.com.devjavagirl.producer.Producer;


@SpringBootApplication
@ComponentScan(basePackageClasses = { Producer.class, SharedController.class})
@EnableAutoConfiguration
public class WorkshopProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopProducerApplication.class, args);
	}

}
