package com.Proy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.Proy.dto")
public class CitasMedicasApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitasMedicasApiApplication.class, args);
	}

}
