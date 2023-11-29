/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprograma.etapa2.incidenttracker.DAO;

import com.argprograma.etapa2.incidenttracker.config.DBConfig;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author mye
 */
public class AbstractJPADAO<T extends Serializable> {
    private Class<T> clazz;
    EntityManager entityManager = DBConfig.getEntityManager();

    public final void setClazz( Class< T > clazzToSet ){
        this.clazz = clazzToSet;
    }

    public T findOne( int id ){
        return entityManager.find( clazz, id );
    }
           
    public List< T > findAll(){
        return entityManager.createQuery("from " + clazz.getName())
        .getResultList();
    }

    public void create( T entity ){
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist( entity );
        tx.commit();
    }

    public T update( T entity ){
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        T entityMerged = entityManager.merge( entity );
        tx.commit();
        return entityMerged;
    }

    public void delete( T entity ){
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.remove( entity );
        tx.commit();
    }
}

