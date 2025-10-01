package org.atividades.atividade3.Lampedusa.model;

public class Publico {
    private int pessoas;
    private String emocao;
    private boolean impactado;

    // Construtor
    public Publico(int pessoas, String emocao, boolean impactado) {
        this.pessoas = pessoas;
        this.emocao = emocao;
        this.impactado = impactado;
    }

    // Getters
    public int getPessoas() {
        return pessoas;
    }

    public String getEmocao() {
        return emocao;
    }

    public boolean isImpactado() {
        return impactado;
    }

    // Setters
    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public void setEmocao(String emocao) {
        this.emocao = emocao;
    }

    public void setImpactado(boolean impactado) {
        this.impactado = impactado;
    }

    // Métodos
    public void reagir() {
        System.out.println("O público de " + pessoas + " pessoas sente: " + emocao);
    }

    public void refletir() {
        System.out.println("Reflete sobre a crise migratória.");
    }

    public void compartilhar() {
        System.out.println("Compartilha a experiência.");
    }
}
