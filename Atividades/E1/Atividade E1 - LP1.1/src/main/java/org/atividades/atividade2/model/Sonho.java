// Sonho.java
package org.atividades.atividade2.model;

public class Sonho {
    public String pessoa_principal;
    public String pessoa_secundario;
    public String acao;
    public boolean realizado;

    public void sonhar() {
        if (this.realizado) {
            System.out.println("Hoje " + this.pessoa_principal + " sonhei que " + this.pessoa_secundario + " " + this.acao);
            System.out.println("E vinha muito mais que linda");
        } else {
            System.out.println("Não sonhou, não tem música");
        }
    }
}
