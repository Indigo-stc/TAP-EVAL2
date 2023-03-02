package com.ista.evalmongo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "Plato")
public class Plato {

    private String nombrePlato;;
    private String descripcion;;
    private Double precio;;


}
