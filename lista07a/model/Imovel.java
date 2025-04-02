/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista07a.model;

/**
 *
 * @author jcezarotto
 */
public class Imovel {

    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;

    public Imovel(String endereco, int area, Bairro bairro, Finalidade finalidade) {
        this.endereco = endereco;
        this.area = area;
        this.bairro = bairro;
        this.finalidade = finalidade;
    }

    public double calcularIptu() {
        setEndereco(endereco);
        setArea(area);
        setBairro(bairro);
        setFinalidade(finalidade);

        double valor = 0;

        switch (finalidade) {
            case RESIDENCIAL:
                valor = area * 1;
                break;
            case COMERCIAL:
                if (area <= 100) {
                    valor = 500;
                } else if (area > 100 && area < 400) {
                    valor = 1000;
                } else {
                    valor = area * 2.55;
                }
                break;
            case INDUSTRIAL:
                if (area <= 2000) {
                    valor = 1000;
                } else {
                    valor = area * 0.55;
                }
                break;

        }
        return valor * bairro.getCoeficienteIptu();

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }

}
