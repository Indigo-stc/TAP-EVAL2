package com.ista.evalmongo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "Cliente")
public class Cliente {

    private String nombre;;
    private String apellido;;
    private String cedula;;
    private String correo;;


}
