package com.argprograma.etapa2.incidenttracker;

import com.argprograma.etapa2.incidenttracker.modelo.Tecnico;
import com.argprograma.etapa2.incidenttracker.notificacion.Canal;
import com.argprograma.etapa2.incidenttracker.services.TecnicoService;
import org.junit.jupiter.api.Test;

public class PersistenciaTecnicoTest {
    @Test
    public void persistirTecnico() {
        Tecnico tecnico = new Tecnico("20-42.444.444-5","Eze Testing", Canal.EMAIL);
        TecnicoService tecnicoService = new TecnicoService();
        tecnicoService.create(tecnico);

        System.out.println("Prueba.");
    }
}
