package com.argprograma.etapa2.incidenttracker.DAO;

import com.argprograma.etapa2.incidenttracker.modelo.Cliente;

public class ClienteDAO extends AbstractJPADAO<Cliente> {
    public ClienteDAO(){
        setClazz(Cliente.class );
    }
}
