package com.argprograma.etapa2.incidenttracker.modelo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Servicio {
    private int idServicio;
    private String nombre;
    private String descripcion;
    private List<TipoDeProblema> tiposDeProblema;

    public Servicio() {
        this.tiposDeProblema = new ArrayList<>();
    }
}
