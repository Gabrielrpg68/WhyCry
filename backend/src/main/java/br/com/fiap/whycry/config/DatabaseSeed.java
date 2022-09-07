package br.com.fiap.whycry.config;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.whycry.model.Cliente;
import br.com.fiap.whycry.repository.ClienteRepository;

@Configuration
public class DatabaseSeed implements CommandLineRunner {
    @Autowired
    ClienteRepository repository;

    public void run(String... args) {
        repository.saveAll(List.of(
            new Cliente("Gabriel", "gabrielrpg68@gmail.com", "12345", LocalDate.of(2000, 07, 22), "M", null),
            new Cliente("Joao Paulo", "JoaoPaulo@gmail.com", "54321", LocalDate.of(1997, 02, 25), "M", null)
        ));
    }
}
