/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01.Questao4;

import java.util.Scanner;

/**
 *
 * @author jcezarotto
 */
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa[] pessoa = new Pessoa[3];

        for (int i = 0; i < 3; i++) {
            pessoa[i] = new Pessoa();
             System.out.println("Pessoa " + (i + 1));
             System.out.println("Nome: ");
             pessoa[i].nome = scanner.nextLine();
             System.out.println("Peso: ");
             pessoa[i].peso = scanner.nextFloat();
             System.out.println("Altura: ");
             pessoa[i].altura = scanner.nextFloat();
             scanner.nextLine();
        }
            System.out.println("Dados da pessoas:");
            for(int i = 2; i >= 0; i--){
                double imc = pessoa[i].calcularImc();
                System.out.println("Pessoa " + (i + 1) + ": Nome - " + pessoa[i].nome + " - Altura: " + pessoa[i].altura + " Peso: " + pessoa[i].peso + " IMC: " + imc);
            }

    }
}
