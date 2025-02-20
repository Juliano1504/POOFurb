/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01.Questao3;

import java.util.Scanner;

/**
 *
 * @author jcezarotto
 */
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        int pessoas = 3;

        while (pessoas != 0) {
            System.out.println("Insira o seu peso: ");
            pessoa.peso = scanner.nextFloat();

            System.out.println("Insira a sua altura: ");
            pessoa.altura = scanner.nextFloat();

            System.out.println("Seu IMC e igual a: " + pessoa.calcularImc());

            pessoas--;
        }
        System.out.println("Fim");
    }

}
