package com.argprograma.etapa2.incidenttracker;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter @Setter
public class Tecnico extends Persona {
    List<Especialidad> especialidades = new ArrayList<>();

    public void addProblema() {

    }
    public void addEspecialidad() {

    }
}
