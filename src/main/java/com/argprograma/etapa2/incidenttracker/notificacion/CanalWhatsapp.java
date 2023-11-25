package com.argprograma.etapa2.incidenttracker.notificacion;

import com.argprograma.etapa2.incidenttracker.Persona;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CanalWhatsapp implements CanalComunicacion {
    private DriverWhatsapp driver;
    private Persona receptor;

    public CanalWhatsapp(Persona receptor) {
        this.receptor = receptor;

        this.driver = new DriverWhatsappTerminal();
        // this.driver = new DriverWhatsappTwilio();
    }

    @Override
    public String enviarNotificacion(Mensaje mensaje) {
        return driver.notificar(mensaje, receptor);
    }
}
