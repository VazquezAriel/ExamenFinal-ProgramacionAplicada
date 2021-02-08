/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorJugador;
import ec.edu.ups.controlador.ControladorRuleta;
import ec.edu.ups.modelo.Jugador;
import ec.edu.ups.modelo.Ruleta;

/**
 *
 * @author ariel
 */
public class Main {
    
    public static void main(String[] args) {
        ControladorJugador controladorJugador = new ControladorJugador();
        ControladorRuleta controladorRuleta = new ControladorRuleta();
        Ruleta r = new Ruleta();
        r.setSaldo(50000);
        controladorRuleta.crear(r);
        
    }
    
}
