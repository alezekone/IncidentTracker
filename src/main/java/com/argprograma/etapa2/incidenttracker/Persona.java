package com.argprograma.etapa2.incidenttracker;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter @Getter
public class Persona {
    private String cuit_cuil;
    private String apellido;
    private String nombre;
    private String direccion;
    private String email;
    private String telefono;
    private Date fechaDeNacimiento;
}
