/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Aula01.Exemplo;

/**
 *
 * @author jcezarotto
 */
public class Aula02 {

    public static void main(String[] args) {
        Gato gato;
        gato = new Gato();
        gato.nome = "Frajola";
        gato.cor = "Preto e branco";
        gato.peso = 3.2f;

        System.out.println("O nome do gato e: " + gato.nome);
        System.out.println(gato.miar());
    }
}
