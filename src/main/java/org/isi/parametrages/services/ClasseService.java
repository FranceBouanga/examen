package org.isi.parametrages.services;

import org.isi.parametrages.entities.Classe;
import org.isi.parametrages.repositories.ClasseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasseService {
    private final ClasseRepository repository;

    public ClasseService(ClasseRepository repository) {
        this.repository = repository;
    }

    public List<Classe> findAll() {
        return repository.findAll();
    }

    public Classe save(Classe classe) {
        return repository.save(classe);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Classe findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
