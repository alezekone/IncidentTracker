package com.argprograma.etapa2.incidenttracker.notificacion;

import com.argprograma.etapa2.incidenttracker.modelo.Mensaje;
import com.argprograma.etapa2.incidenttracker.modelo.Persona;

// Driver de prueba
public class DriverWhatsappTerminal implements DriverWhatsapp {
    @Override
    public String notificar(Mensaje mensaje, Persona receptor) {
        String envio = "**Whatsapp\n" +
                       "**TO: " + receptor.getTelefono() + "**\n" +
                       "Mensaje: " + mensaje.getCuerpo();

        System.out.println(envio);
        return envio;
    }
}
