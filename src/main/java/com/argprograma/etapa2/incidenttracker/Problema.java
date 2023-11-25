package com.argprograma.etapa2.incidenttracker;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class Problema {
    private int idProblema;
    private int tiempoEstimadoResolucion;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFin;
    private String descripcion;
    private Complejidad complejidad;
    private Estado estado;
    private Tecnico tecnico;
    private TipoDeProblema tipoDeProblema;
    private Servicio servicio;

    public void agregarHorasPorComplejidad(Complejidad complejidad) {
        // TODO
    }
    public void agregarHorasAdicionales(int horas) {
        // TODO
    }
}
