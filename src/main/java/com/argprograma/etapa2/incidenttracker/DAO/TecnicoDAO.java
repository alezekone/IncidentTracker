package com.argprograma.etapa2.incidenttracker.DAO;

import com.argprograma.etapa2.incidenttracker.modelo.Tecnico;

/**
 *
 * @author mye
 */
public class TecnicoDAO extends AbstractJPADAO<Tecnico> {
    public TecnicoDAO(){
        setClazz(Tecnico.class );
    }   
}
