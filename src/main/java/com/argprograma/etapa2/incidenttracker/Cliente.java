package com.argprograma.etapa2.incidenttracker;

import com.argprograma.etapa2.incidenttracker.notificacion.Canal;
import com.argprograma.etapa2.incidenttracker.notificacion.CanalComunicacion;
import com.argprograma.etapa2.incidenttracker.notificacion.Mensaje;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Cliente extends Persona {
    private String razonSocial;
    private List<Servicio> servicios;
    private List<Incidente> incidentes;
    private List<Mensaje> mensajes;
    private CanalComunicacion canalComunicacion;

    public Cliente(Canal canal) {
        this.servicios = new ArrayList<>();
        this.incidentes = new ArrayList<>();
        this.mensajes = new ArrayList<>();

        this.canalComunicacion = canal.crear(this);
    }

    public boolean addIncidente() {
        // TODO
        return true;
    }
    public boolean addServicio() {
        // TODO
        return true;
    }
}
