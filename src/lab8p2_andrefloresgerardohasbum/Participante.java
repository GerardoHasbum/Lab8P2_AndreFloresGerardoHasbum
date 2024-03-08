/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_andrefloresgerardohasbum;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ghasb
 */
public class Participante extends User implements Serializable{
    
    public ArrayList<Torneo> inscritos = new ArrayList();
    public ArrayList<Torneo> ganados = new ArrayList();

    public Participante() {
    }

    public Participante(String nombre, String password) {
        super(nombre, password);
    }

    public ArrayList<Torneo> getInscritos() {
        return inscritos;
    }

    public void setInscritos(ArrayList<Torneo> inscritos) {
        this.inscritos = inscritos;
    }

    public ArrayList<Torneo> getGanados() {
        return ganados;
    }

    public void setGanados(ArrayList<Torneo> ganados) {
        this.ganados = ganados;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
