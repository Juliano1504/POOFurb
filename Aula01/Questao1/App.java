/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01.Questao1;

/**
 *
 * @author jcezarotto
 */
public class App {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.peso = 78;
        pessoa.altura = 1.75f;

        System.out.println("O IMC da pessoa e igual a: " + pessoa.calcularImc());
    }
}
