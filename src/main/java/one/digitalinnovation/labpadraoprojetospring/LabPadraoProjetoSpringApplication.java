package one.digitalinnovation.labpadraoprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableFeignClients
@SpringBootApplication
public class LabPadraoProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadraoProjetoSpringApplication.class, args);
	}

}
