package org.atividades.atividade3.TheBearerIrma.model;

public class Recipiente {
    public String tipo;
    public double volume;
    public String cor;

    public Recipiente(String tipo, double volume, String cor) {
        this.tipo = tipo;
        this.volume = volume;
        this.cor = cor;
    }

    public void encherRecipiente() {
        System.out.println("O recipiente " + tipo + " tem o volume " + volume + " e a cor " + cor);
    }
}
