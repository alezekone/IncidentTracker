package com.argprograma.etapa2.incidenttracker;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Tecnico extends Persona {
    private List<Especialidad> especialidades = new ArrayList<>();

    public void addProblema() {

    }
    public void addEspecialidad() {

    }
}
