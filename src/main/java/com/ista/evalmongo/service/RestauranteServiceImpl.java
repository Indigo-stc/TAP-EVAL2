package com.ista.evalmongo.service;

import com.ista.evalmongo.model.Restaurante;
import com.ista.evalmongo.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class RestauranteServiceImpl extends GenericServiceImpl<Restaurante, Long> implements RestauranteService  {

    @Autowired
    RestauranteRepository restauranteRepository;

    @Override
    public CrudRepository<Restaurante, Long> getDao() {
        return restauranteRepository;
    }

}
