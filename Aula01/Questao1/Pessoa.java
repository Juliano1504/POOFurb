/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01.Questao1;

/**
 *
 * @author jcezarotto
 */
public class Pessoa {

    float peso;
    float altura;

    public double calcularImc() {
        return peso / (altura * altura);
    }
}
