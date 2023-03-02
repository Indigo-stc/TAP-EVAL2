package com.ista.evalmongo.repository;

import com.ista.evalmongo.model.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepository extends MongoRepository<Restaurante, Long> {
}
