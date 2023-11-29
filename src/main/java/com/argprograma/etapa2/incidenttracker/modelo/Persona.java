package com.argprograma.etapa2.incidenttracker.modelo;

import com.argprograma.etapa2.incidenttracker.notificacion.Canal;
import com.argprograma.etapa2.incidenttracker.notificacion.CanalComunicacion;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

// Mapeo de Herencia - Strategy: TABLE_PER_CLASS
// No puedo usar la estrategia de MappedSuperclas, puesto que,
// es nuestro caso, la superclase es una entidad (tiene una PK.)

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Setter @Getter @NoArgsConstructor
public class Persona {
    @Id
    @Column(name="CUIT_CUIL")
    private String cuit_cuil;
    @Column(name="DNI")
    private String dni;
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
    @Enumerated(value = EnumType.STRING)
    private Canal canal;
    @Transient
    private CanalComunicacion canalComunicacion;
    @OneToMany
    @JoinColumn(name = "CUIT_CUIL")
    private List<Mensaje> mensajes;
    
    public Persona(String cuitcuil, String nombre, Canal canal) {
        this.cuit_cuil = cuitcuil;
        this.nombre = nombre;
        this.canal = canal;
    } 
}
