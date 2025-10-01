package org.atividades.atividade4.model;

public class Animal {
    public String nome;
    public double altura;
    public String especie;
    public String cor;

    public void alimentar() {
        System.out.println(nome + " está se alimentando");
    }

    public void andar() {
        System.out.println(nome + " está andando");
    }

    public void brincar() {
        System.out.println(nome + " está brincando");
    }
}
