package com.argprograma.etapa2.incidenttracker;

import com.argprograma.etapa2.incidenttracker.modelo.Persona;
import com.argprograma.etapa2.incidenttracker.notificacion.Canal;
import com.argprograma.etapa2.incidenttracker.notificacion.CanalComunicacion;
import com.argprograma.etapa2.incidenttracker.notificacion.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CanalEmailTest {

    @Test
    public void enviarEmailAReceptor() {
        Persona receptor = new Persona();
        receptor.setEmail("receptor@gmail.com");

        Mensaje msj = new Mensaje();
        msj.setCuerpo("Mensaje personalizado");

        CanalComunicacion canal = Canal.EMAIL.crear(receptor);

        String esperado = """
                **Email
                **TO: receptor@gmail.com**
                Mensaje: Mensaje personalizado""";

        assert canal != null;
        String enviado = canal.enviarNotificacion(msj);

        Assertions.assertEquals(esperado, enviado);
    }
}
