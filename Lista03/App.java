/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista03;

import java.util.Scanner;

/**
 *
 * @author jcezarotto
 */
public class App {
    
    static Scanner scanner = new Scanner(System.in);
    static Funcionario[] funcionarios = new Funcionario[5]; 

    public static void main(String[] args) {
   
        Funcionario funcionario;
        for (int i = 0; i < funcionarios.length; i++){
            funcionario = cadastrarFuncionario();
            funcionarios[i] = funcionario;
        }
        
        for (int i = 0; i < funcionarios.length; i++){
            exibirFuncionario(funcionarios[i]);
        }
    }
    
    public static void exibirFuncionario(Funcionario funcionario) {
         System.out.println("Nome: " + funcionario.getNome() + " Salario: " + funcionario.getSalario() + " IRPF: " + funcionario.calcularIrpf());
    }
    
    public static Funcionario cadastrarFuncionario() {
        System.out.println("Informe o nome do funcionario: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o salario do funcionário: ");
        double salario = Double.parseDouble(scanner.nextLine());
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setSalario(salario);
         
        return funcionario;
    }
}
