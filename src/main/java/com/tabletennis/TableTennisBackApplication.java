package com.tabletennis;

import com.tabletennis.entity.TestEntity;
import com.tabletennis.repository.TestRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TableTennisBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TableTennisBackApplication.class, args);
	}

	@Bean
	CommandLineRunner run(TestRepository testRepository) {
		return args -> {
			TestEntity entity = new TestEntity();
			entity.setName("Conexión exitosa");
			testRepository.save(entity);
		};
	}
}
