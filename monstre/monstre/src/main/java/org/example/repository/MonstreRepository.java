package org.example.repository;

import org.example.model.Monstre;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonstreRepository extends MongoRepository<Monstre, String> {
}
