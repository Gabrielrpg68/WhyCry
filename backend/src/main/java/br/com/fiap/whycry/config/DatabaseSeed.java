package br.com.fiap.whycry.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.whycry.model.User;
import br.com.fiap.whycry.repository.UserRepository;

@Configuration
public class DatabaseSeed implements CommandLineRunner {
    @Autowired
    UserRepository repository;

    public void run(String... args) {
        repository.saveAll(List.of(
            new User("Gabriel", "gabrielrpg68@gmail.com"),
            new User("Joao Paulo", "JoaoPaulo@gmail.com")
        ));
    }
}
