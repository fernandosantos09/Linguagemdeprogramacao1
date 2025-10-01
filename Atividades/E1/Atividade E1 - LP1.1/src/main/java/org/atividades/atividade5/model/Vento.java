package org.atividades.atividade5.model;

public class Vento {
    private double velocidade; // Velocidade do vento em km/h
    private String direcao; // Direção do vento (e.g., norte, sul)
    private double intensidade; // Intensidade do vento (escala de Beaufort)

    public Vento(double velocidade, String direcao, double intensidade) {
        this.velocidade = velocidade;
        this.direcao = direcao;
        this.intensidade = intensidade;
    }

    public void transportarAreia() {
        System.out.println("O vento está transportando areia.");
    }

    public void modelarDunas() {
        System.out.println("O vento está modelando as dunas.");
    }

    public void alterarDirecao() {
        System.out.println("O vento mudou de direção.");
    }

    // GETTERS
    public double getVelocidade() { return velocidade; }
    public String getDirecao() { return direcao; }
    public double getIntensidade() { return intensidade; }
}
