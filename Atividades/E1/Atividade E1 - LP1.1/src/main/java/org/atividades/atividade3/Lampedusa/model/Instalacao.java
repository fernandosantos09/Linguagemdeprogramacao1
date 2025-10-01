package org.atividades.atividade3.Lampedusa.model;

public class Instalacao {
    private String titulo;
    private String local;
    private String material;

    // Construtor
    public Instalacao(String titulo, String local, String material) {
        this.titulo = titulo;
        this.local = local;
        this.material = material;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getLocal() {
        return local;
    }

    public String getMaterial() {
        return material;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Métodos
    public void exibir() {
        System.out.println("Instalação: " + titulo + " em " + local + " feita de " + material);
    }

    public void refletir() {
        System.out.println("Provoca reflexão sobre migração.");
    }

    public void registrar() {
        System.out.println("Instalação registrada em fotos.");
    }
}
