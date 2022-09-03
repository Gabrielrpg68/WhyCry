package br.com.fiap.whycry.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.whycry.model.User;
import br.com.fiap.whycry.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    UserRepository repository;

    public List<User> listAll(){
        return repository.findAll();
    }

    public void save(User task) {
        repository.save(task);
    }

    public Optional<User> getById(Long id) {
        return repository.findById(id);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
