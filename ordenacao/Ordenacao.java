/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ordenacao;

import com.mycompany.ordenacao.model.OrdenarNome;
import com.mycompany.ordenacao.model.OrdenarPontosSaldo;
import com.mycompany.ordenacao.model.OrdenarSaldoGols;
import com.mycompany.ordenacao.model.Time;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jcezarotto
 */
public class Ordenacao {

    public static void main(String[] args) {
        ArrayList<Time> times = new ArrayList();
        times.add(new Time("Flamengo", 5, -5));
        times.add(new Time("Vasco", 30, 10));
        times.add(new Time("Internacional", 12, -2));
        times.add(new Time("Gremio", 15, 2));
        times.add(new Time("Chapecoense", 20, 8));
        times.add(new Time("Concordia", 11, 9));
        times.add(new Time("Atletico MG", 10, 6));
        times.add(new Time("Corinthians", 5, -5));
        times.add(new Time("Santos", 20, 5));
        
       // times.sort(new OrdenarPontosSaldo());
       // times.sort(new OrdenarSaldoGols());
          times.sort(new OrdenarNome());
       
       // Collections.reverse(times); //Inverte a ordem
        
        for (Time t: times) {
            System.out.println(t);
        }
    }
}
