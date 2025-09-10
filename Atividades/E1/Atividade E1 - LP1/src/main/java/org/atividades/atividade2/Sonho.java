package org.atividades.atividade2;

public class Sonho {
    String pessoa_principal;
    String pessoa_secundario;
    String acao;
    Boolean realizado;

    void sonhar() {
        if (this.realizado) {
            System.out.println("Hoje " + this.pessoa_principal + " sonhei que " + this.pessoa_secundario + " " + this.acao);
            System.out.println("E vinha muito mais que linda");
        } else {
            System.out.println("Não sonhou, não tem música");
        }

    }
}
