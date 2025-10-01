package org.atividades.atividade3.Lampedusa.model;

public class Barco {
    private String tipo;
    private double tamanho;
    private String simbolo;

    // Construtor
    public Barco(String tipo, double tamanho, String simbolo) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.simbolo = simbolo;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public double getTamanho() {
        return tamanho;
    }

    public String getSimbolo() {
        return simbolo;
    }

    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    // Métodos
    public void mostrar() {
        System.out.println("Barco " + tipo + " de " + tamanho + "m simboliza " + simbolo);
    }

    public void flutuar() {
        System.out.println("O barco flutua no canal.");
    }

    public void contrastar() {
        System.out.println("Contrasta com os iates de luxo.");
    }
}
