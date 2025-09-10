package org.atividades.atividade4;

public class Veiculo {
    String tipo; // carro, moto. bike, balao. aeronave
    String marca;
    String modelo;
    String cor;

    void andando(){
        System.out.println("O " + tipo + " da " + marca + " modelo " + modelo + "está andando para o além");
    }
    void falhando(){
        System.out.println("O" + tipo + " "  + modelo + " está falhando"); //VW Gol estourou trambulador
    }
    void estacionando(){
        System.out.println("O" + tipo + " da " + marca + " estacionando");
    }
}
