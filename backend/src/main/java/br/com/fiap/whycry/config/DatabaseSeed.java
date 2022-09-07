package br.com.fiap.whycry.config;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.whycry.model.Agenda;
import br.com.fiap.whycry.model.Bebe;
import br.com.fiap.whycry.model.Cliente;
import br.com.fiap.whycry.repository.AgendaRepository;
import br.com.fiap.whycry.repository.BebeRepository;
import br.com.fiap.whycry.repository.ClienteRepository;
import br.com.fiap.whycry.service.ClienteService;

@Configuration
public class DatabaseSeed implements CommandLineRunner {
    @Autowired
    ClienteRepository repository;
    @Autowired
    BebeRepository repository2;
    @Autowired
    AgendaRepository repository3;


    ClienteService service;

    public void run(String... args) {
        repository.saveAll(List.of(
            new Cliente("Gabriel", "gabrielrpg68@gmail.com", "12345", LocalDate.of(2000, 07, 22), "M", null),
            new Cliente("Joao Paulo", "JoaoPaulo@gmail.com", "54321", LocalDate.of(1997, 02, 25), "M", null)
        ));

        repository2.saveAll(List.of(
            new Bebe(1, "Valentina", LocalDate.of(2021, 05, 26), "F"),
            new Bebe(2, "Enzo", LocalDate.of(2022, 03, 26), "M")
        ));

        repository3.saveAll(List.of(
            new Agenda(1, LocalDateTime.of(2022, 8, 29, 8, 26, 54), "Dar comida")
        ));
    }

    
}
