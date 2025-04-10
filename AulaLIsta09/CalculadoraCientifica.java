/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulaheranca.model;

/**
 *
 * @author jcezarotto
 */
public class CalculadoraCientifica extends Calculadora {

    public double potencia(double valor, double potencia) {
        memoria = Math.pow(valor, potencia);
        return memoria;
    }

    public double raizQuadrada(double valor) {
        memoria = Math.sqrt(valor);
        return memoria;
    }

    //Estou sobresvendo o metodo herdado, mantendo o nome, mas mudando a funcionalidade
    @Override
    public double somar(double a, double b) {
        memoria = Math.abs(a) + Math.abs(b);
        return memoria;
    }

    @Override
    public String toString() {
        return "Calculadora Cientifica memoria: " + memoria;
    }
}
