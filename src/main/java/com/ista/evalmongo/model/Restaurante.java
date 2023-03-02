package com.ista.evalmongo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Document(collection = "Restaurante")
public class Restaurante {

    @Id
    private Long id_restaurante;
    private String nombre;;
    private String direccion;;
    private String correo;;
    private String telefono;;

    private List<Cliente> clientes;

    private List<Carta> cartas;

}
