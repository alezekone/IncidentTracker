package com.argprograma.etapa2.incidenttracker.notificacion;

import com.argprograma.etapa2.incidenttracker.modelo.Mensaje;
import com.argprograma.etapa2.incidenttracker.modelo.Persona;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CanalEmail implements CanalComunicacion {
    private DriverEmail driver;
    private Persona receptor;

    public CanalEmail(Persona receptor) {
        this.receptor = receptor;

        this.driver = new DriverEmailTerminal();
        // this.driver = new DriverEmailJakarta();
    }

    @Override
    public String enviarNotificacion(Mensaje mensaje) {
        return driver.notificar(mensaje, receptor);
    }
}
