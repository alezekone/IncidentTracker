/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.argprograma.etapa2.incidenttracker;

import com.argprograma.etapa2.incidenttracker.modelo.Tecnico;
import com.argprograma.etapa2.incidenttracker.notificacion.Canal;
import com.argprograma.etapa2.incidenttracker.services.TecnicoService;
import java.util.List;

/**
 *
 * @author Grupo 2
 */
public class IncidentTracker {

    public static void main(String[] args) {
        // TODO

        TecnicoService tecnicoService = new TecnicoService();

        Tecnico tecnico1 = new Tecnico("1111111","Eze", Canal.EMAIL);
        Tecnico tecnico2 = new Tecnico("2222222","Fran", Canal.WHATSAPP);

        tecnicoService.create(tecnico1);
        tecnicoService.create(tecnico2);
        
        System.out.println("Prueba.");
    }
}





//		TecnicoSrvice empleadoService = new TecnicoService();
//		// DireccionService direccionService = new DireccionService();
//
//		TecnicoService.create(new Tecnico("Eze Testing"));
//		
//		//direccionService.saveDireccion(new Direccion());
//		
//		//Obtener un empleado con id = 1
//		Empleado unEmpleado = empleadoService.findOne(1);
//		
//		List<Empleado> empleados = empleadoService.findAll();
//
//		System.out.println(unEmpleado.getNombre());
