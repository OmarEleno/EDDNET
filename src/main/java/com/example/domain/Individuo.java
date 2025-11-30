package com.example.domain;

import jakarta.persistence.*; // Importa todas las anotaciones de Jakarta Persistence
import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor; // <-- CAMBIO: Importado

@Data
@NoArgsConstructor // <-- CAMBIO: Añadido para el constructor vacío
@Entity
@Table(name = "individuo")
public class Individuo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_individuo") // <-- CAMBIO: Mapea al nombre exacto de tu columna SQL
    private Long id; 

    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private Integer edad; // <-- CAMBIO: De String a Integer

    // TODOS los getters, setters, toString() y constructores manuales
    // han sido eliminados porque @Data y @NoArgsConstructor los proveen.
}