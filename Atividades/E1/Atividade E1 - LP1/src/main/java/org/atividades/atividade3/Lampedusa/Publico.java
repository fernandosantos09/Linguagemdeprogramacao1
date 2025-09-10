package org.atividades.atividade3.Lampedusa;

class Publico {
    int pessoas;
    String emocao;
    boolean impactado;

    void reagir() {
        System.out.println("O público de " + pessoas + " pessoas sente: " + emocao);
    }

    void refletir() {
        System.out.println("Reflete sobre a crise migratória.");
    }

    void compartilhar() {
        System.out.println("Compartilha a experiência.");
    }
}
