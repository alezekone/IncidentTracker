package com.argprograma.etapa2.incidenttracker.notificacion;

public class DriverEmailTerminal implements DriverEmail {
    @Override
    public void notificar(Mensaje mensaje) {
        System.out.println("**Email**");
        System.out.println("Mensaje: " + mensaje.getCuerpo());
    }
}
