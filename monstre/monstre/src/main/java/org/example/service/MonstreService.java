package org.example.service;

import org.example.model.Monstre;
import org.example.repository.MonstreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonstreService {

    @Autowired
    private MonstreRepository monstreRepository;

    public List<Monstre> getAllMonstres() {
        return monstreRepository.findAll();
    }

    public Optional<Monstre> getMonstre(String id) {
        return monstreRepository.findById(id);
    }

    public Monstre ajouterMonstre(Monstre monstre) {
        return monstreRepository.save(monstre);
    }

    public boolean supprimerMonstre(String id) {
        if (monstreRepository.existsById(id)) {
            monstreRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<Monstre> getMonstreById(String id) {
        return monstreRepository.findById(id);
    }
}
