package com.argprograma.etapa2.incidenttracker.notificacion;

public class CanalEmail implements CanalComunicacion {
    DriverEmail driver = new DriverEmailTerminal();
    //DriverEmail driver = new DriverEmailJakarta();

    @Override
    public void enviarNotificacion(Mensaje mensaje) {
        driver.notificar(mensaje);
    }
}
