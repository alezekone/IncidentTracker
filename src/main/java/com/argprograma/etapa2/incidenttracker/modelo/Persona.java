package com.argprograma.etapa2.incidenttracker.modelo;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

// Mapeo de Herencia - Strategy: TABLE_PER_CLASS
// No puedo usar la estrategia de MappedSuperclas, puesto que,
// es nuestro caso, la superclase es una entidad (tiene una PK.)

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Setter @Getter @NoArgsConstructor
public class Persona {
    @Id
    @Column(name="CUIT_CUIL")
    private String cuit_cuil;
    @Column(name="apellido")
    private String apellido;
    @Column(name="nombre")
    private String nombre;
    @Column(name="direccion")
    private String direccion;
    @Column(name="email")
    private String email;
    @Column(name="telefono")
    private String telefono;
    @Column(name="fecha_de_nacimiento")
    private Date fechaDeNacimiento;
    
    public Persona(String cuitcuil, String nombre) {
        this.cuit_cuil = cuitcuil;
        this.nombre = nombre;
    } 
}
