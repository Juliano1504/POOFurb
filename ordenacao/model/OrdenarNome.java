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
public class OrdenarNome implements Comparator<Time> {

    @Override
    public int compare(Time o1, Time o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
    
}
