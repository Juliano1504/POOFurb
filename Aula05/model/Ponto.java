/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05.model;

/**
 *
 * @author jcezarotto
 */
public class Ponto {

    int x;
    int y;

    public Ponto() {
        x = 0;
        y = 0;
    }

    public Ponto(int x, int y) {
        setX(x);
        setY(y);
    }

    public Quadrante identificarQuadrante() {
        if (x > 0 && y > 0) {
            return Quadrante.PRIMEIRO;
        }
        if (x < 0 && y > 0) {
            return Quadrante.SEGUNDO;
        }
        if (x < 0 && y < 0) {
            return Quadrante.TERCEIRO;
        }
        if (x > 0 && y < 0) {
            return Quadrante.QUARTO;
        }
        return Quadrante.NENHUM;
    }

    public boolean estaIncidindoSobreX() {
        return y == 0;
    }

    public boolean estaIncidindoSobreY() {
        return x == 0;
    }

    /**
     * Realiza o calculo da distancia entre o objeto atual e o ponto do
     * @param outroPonto Ponto a ser utilizado para mediar a distancia
     * @return A distancia entre o objeto e o ponto recebido por parametro
     */
    public double calcularDistancia(Ponto outroPonto) {
        int distanciaX = outroPonto.getX() - this.getX();
        int distanciaY = outroPonto.getY() - this.getY();

        return Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2));
    }

    /**
     * Realiza o calculo da dsitancia eucliadiana entre dois pontos
     * @param p1 primeiro ponto a ser utilizado a dsitancia
     * @param p2 segundo ponto a ser utilizado a dsitancia
     * @return a distancia eculidiana entre os pontos fornecidos por parametro
     */
    public static double calcularDistancia(Ponto p1, Ponto p2) {
        return p1.calcularDistancia(p2);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
