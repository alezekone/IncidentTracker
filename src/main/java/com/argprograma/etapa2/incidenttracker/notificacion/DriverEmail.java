package com.argprograma.etapa2.incidenttracker.notificacion;

import com.argprograma.etapa2.incidenttracker.modelo.Mensaje;
import com.argprograma.etapa2.incidenttracker.modelo.Persona;

public interface DriverEmail {
    String notificar(Mensaje mensaje, Persona receptor);
}
