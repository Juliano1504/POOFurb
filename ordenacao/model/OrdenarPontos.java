/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacao.model;

import java.util.Comparator;

/**
 *
 * @author jcezarotto
 */
public class OrdenarPontos implements Comparator<Time> {

    @Override
    public int compare(Time o1, Time o2) {
        if (o1.getPontos() > o2.getPontos()) {
            return 1;
        }
        if (o1.getPontos() < o2.getPontos()) {
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Time t2 = (Time) obj;
        if (!this.nome.equals(t2.getNome())) {
            return false;
        }
        if (this.pontos != t2.getPontos()) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return nome + " pts: " + pontos + " Sg: " + saldoGols; 
    }
}
