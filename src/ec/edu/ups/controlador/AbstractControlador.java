/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.utils.JPAUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author ariel
 */
public abstract class AbstractControlador<E> {
    private List<E> lista;
    private Class<E> clase;
    private EntityManager em;
    
    public AbstractControlador() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        clase = (Class) pt.getActualTypeArguments()[0];
        em = JPAUtils.getEntityManager();
        lista = buscarTodo();
    }

    public AbstractControlador(EntityManager em) {
        lista = new ArrayList<>();
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        clase = (Class) pt.getActualTypeArguments()[0];
        em = JPAUtils.getEntityManager();
        this.em  = em;
    }
    
    public boolean crear(E objeto) {
        if (validar()) {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
            lista.add(objeto);
            return true;
        }
        return false;
    }
    
    public boolean eliminar(E objeto) {
        em.getTransaction().begin();
        em.remove(em.merge(objeto));
        em.getTransaction().commit();
        lista.remove(objeto);
        return true;
    }
    
    public boolean actualizar(E objeto) {
        if (validar()) {
            em.getTransaction().begin();
            objeto = em.merge(objeto);
            em.getTransaction().commit();
            lista = this.buscarTodo();
            return true;
        }
        return false;
    }
    
    public E buscar(Object id) {
        return (E) em.find(clase, id);
    }
    
    public List<E> buscarTodo() {
        return em.createQuery("Select t from " + clase.getSimpleName() + " t").getResultList();
    }

    public List<E> getLista() {
        return lista;
    }

    public void setLista(List<E> lista) {
        this.lista = lista;
    }

    public Class<E> getClase() {
        return clase;
    }

    public void setClase(Class<E> clase) {
        this.clase = clase;
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    public abstract boolean validar();
}
