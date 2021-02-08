/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author ariel
 */
@Entity
public class Jugador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Column
    private String nombre;
    
    @Column
    private double saldo;
    
    @Column
    private int victorias;
    
    @Column
    private int perdidas;
    
    @Column
    private String estrategia;
    
    @OneToMany(mappedBy = "jugador", cascade = CascadeType.ALL)
    private List<Apuesta> apuestas;

    public Jugador() {
    }

    public Jugador(Long id) {
        this.id = id;
    }

    public Jugador(Long id, String nombre, double saldo, int victorias, int perdidas, String estrategia, List<Apuesta> apuestas) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
        this.victorias = victorias;
        this.perdidas = perdidas;
        this.estrategia = estrategia;
        this.apuestas = apuestas;
    }
    
    public Jugador(String nombre, double saldo, String estrategia) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.estrategia = estrategia;
        this.victorias = 0;
        this.perdidas = 0;
        this.apuestas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getPerdidas() {
        return perdidas;
    }

    public void setPerdidas(int perdidas) {
        this.perdidas = perdidas;
    }

    public List<Apuesta> getApuestas() {
        return apuestas;
    }

    public void setApuestas(List<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugador)) {
            return false;
        }
        Jugador other = (Jugador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.modelo.Jugador[ id=" + id + " ]";
    }
    
}
