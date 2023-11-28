package com.argprograma.etapa2.incidenttracker.notificacion;

import com.argprograma.etapa2.incidenttracker.modelo.Mensaje;

public interface CanalComunicacion {
    String enviarNotificacion(Mensaje mensaje);
}
