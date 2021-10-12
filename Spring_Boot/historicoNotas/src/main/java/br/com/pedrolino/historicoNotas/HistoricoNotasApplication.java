package br.com.pedrolino.historicoNotas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class HistoricoNotasApplication {

	public static void main(String[] args) {
		SpringApplication.run(HistoricoNotasApplication.class, args);
	}

}
