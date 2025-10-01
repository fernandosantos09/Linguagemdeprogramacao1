package org.atividades.atividade3.TheBearerIrma.model;

public class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void cadastrarPessoa() {
        System.out.println(nome + " cadastrado com sucesso!");
    }
}
