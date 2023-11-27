/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.argprograma.etapa2.incidenttracker;

import com.argprograma.etapa2.incidenttracker.modelo.Tecnico;
import com.argprograma.etapa2.incidenttracker.services.TecnicoService;
import java.util.List;

/**
 *
 * @author Grupo 2
 */
public class IncidentTracker {

    public static void main(String[] args) {
        // TODO
        Tecnico tecnico = new Tecnico("20-44.444.444-5","Eze Testing");
        TecnicoService tecnicoService = new TecnicoService();
        tecnicoService.create(tecnico);
        
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
