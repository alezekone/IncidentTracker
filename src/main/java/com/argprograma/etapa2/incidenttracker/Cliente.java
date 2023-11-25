package com.argprograma.etapa2.incidenttracker;

import com.argprograma.etapa2.incidenttracker.notificacion.CanalComunicacion;
import com.argprograma.etapa2.incidenttracker.notificacion.Mensaje;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Cliente extends Persona {
    private String razonSocial;
    private List<Servicio> servicios = new ArrayList<>();
    private List<Incidente> incidentes = new ArrayList<>();
    private List<Mensaje> mensajes = new ArrayList<>();
    private CanalComunicacion canalComunicacion;

    public boolean addIncidente() {
        // TODO
        return true;
    }
    public boolean addServicio() {
        // TODO
        return true;
    }
}
