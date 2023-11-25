package com.argprograma.etapa2.incidenttracker;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Especialidad {
    private int idEspecialidad;
    private String nombre;
    private String descripcion;
    private List<TipoDeProblema> tiposDeProblema;

    public Especialidad() {
        this.tiposDeProblema = new ArrayList<>();
    }
}
