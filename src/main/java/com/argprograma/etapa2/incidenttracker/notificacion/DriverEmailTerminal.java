package com.argprograma.etapa2.incidenttracker.notificacion;

import com.argprograma.etapa2.incidenttracker.Persona;

// Driver de prueba
public class DriverEmailTerminal implements DriverEmail {
    @Override
    public String notificar(Mensaje mensaje, Persona receptor) {
        String envio = "**Email\n" +
                "**TO: " + receptor.getEmail() + "**\n" +
                "Mensaje: " + mensaje.getCuerpo();

        System.out.println(envio);
        return envio;
    }
}
