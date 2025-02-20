/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01.Questao4;

/**
 *
 * @author jcezarotto
 */
public class Pessoa {

    String nome;
    float peso;
    float altura;

    public double calcularImc() {
        return peso / (altura * altura);
    }
}
