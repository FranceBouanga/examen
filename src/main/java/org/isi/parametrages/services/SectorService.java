package org.isi.parametrages.services;
import org.isi.parametrages.entities.Sector;
import org.isi.parametrages.repositories.SectorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectorService {

    private final SectorRepository repository;

    public SectorService(SectorRepository repository) {
        this.repository = repository;
    }

    public List<Sector> findAll() {
        return repository.findAll();
    }

    public Sector save(Sector sector) {
        return repository.save(sector);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

