
package org.atividades.atividade2.model;

public class Flor {
    public String nome;
    public String fragancia;
    public String cor;

    public void exalarPerfume() {
        System.out.println("Cheirando a flor de " + this.nome);
    }
}
