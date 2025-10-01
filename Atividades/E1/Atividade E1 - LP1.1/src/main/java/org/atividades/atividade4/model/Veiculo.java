package org.atividades.atividade4.model;

public class Veiculo {
    public String tipo; // carro, moto, bike, balão, aeronave
    public String marca;
    public String modelo;
    public String cor;

    public void andando() {
        System.out.println("O " + tipo + " da " + marca + " modelo " + modelo + " está andando");
    }

    public void falhando() {
        System.out.println("O " + tipo + " " + modelo + " está falhando");
    }

    public void estacionando() {
        System.out.println("O " + tipo + " da " + marca + " está estacionando");
    }
}
