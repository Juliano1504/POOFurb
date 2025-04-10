/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aulaheranca;

import com.mycompany.aulaheranca.model.Calculadora;
import com.mycompany.aulaheranca.model.CalculadoraCientifica;

/**
 *
 * @author jcezarotto
 */
public class AulaHeranca {

    public static void main(String[] args) {
        CalculadoraCientifica calcCientifica = new CalculadoraCientifica();
        Calculadora calc = new Calculadora();

        calcCientifica.somar(-2d, -2d);
        System.out.println(calcCientifica);

        calc.somar(-2d, -2d);
        System.out.println(calcCientifica.getMemoria());

    }
}
