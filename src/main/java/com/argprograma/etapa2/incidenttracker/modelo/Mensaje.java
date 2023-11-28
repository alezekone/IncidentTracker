package com.argprograma.etapa2.incidenttracker.modelo;

import com.argprograma.etapa2.incidenttracker.modelo.Incidente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Mensaje")
@Getter @Setter
public class Mensaje {
    @Id
    @Column(name="idMensaje")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMensaje;
    @Column(name="titulo")
    private String titulo;
    @Column(name="cuerpo")
    private String cuerpo;
    @Transient
    private Incidente incidente;
    @Column(name="fueMandado")
    boolean fueMandado;

}
