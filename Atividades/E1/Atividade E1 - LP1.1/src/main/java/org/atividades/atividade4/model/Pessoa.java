package org.atividades.atividade4.model;

public class Pessoa {
    public String nome;
    public String idade;
    public String altura;
    public String genero;

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome + " Idade: " + idade + " Altura: " + altura);
    }

    public void andar() {
        System.out.println(nome + " está caminhando");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo");
    }
}
