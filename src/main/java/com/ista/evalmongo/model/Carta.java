package com.ista.evalmongo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Document(collection = "Carta")
public class Carta {

    private String nombre;;
    private String categoria;;
    private String cantidad;;

    private List<Plato> platos;

}
