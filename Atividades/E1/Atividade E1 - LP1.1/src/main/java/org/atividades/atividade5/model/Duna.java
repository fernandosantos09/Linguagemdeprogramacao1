package org.atividades.atividade5.model;

public class Duna {
    private double altura;
    private double largura;
    private String tipo;

    public Duna(double altura, double largura, String tipo) {
        this.altura = altura;
        this.largura = largura;
        this.tipo = tipo;
    }

    public void acumularAreia() {
        System.out.println("A duna está acumulando mais areia.");
    }

    public void mudarForma() {
        System.out.println("A duna está mudando de forma devido ao vento.");
    }

    public void estabilizar() {
        System.out.println("A duna está estabilizando com a vegetação.");
    }

    // GETTERS
    public double getAltura() { return altura; }
    public double getLargura() { return largura; }
    public String getTipo() { return tipo; }
}
