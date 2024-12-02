package com.ecom.inventoryservice;

import com.ecom.inventoryservice.entities.Product;
import com.ecom.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner start(ProductRepository productRepository) {
		return args -> {
			productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Laptop").price(1000).quantity(10).build());
			productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Smartphone").price(500).quantity(20).build());
			productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Tablet").price(300).quantity(30).build());
		};
	}

}
