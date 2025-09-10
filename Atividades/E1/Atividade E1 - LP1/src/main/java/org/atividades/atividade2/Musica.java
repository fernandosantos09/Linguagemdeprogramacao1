package org.atividades.atividade2;
// https://www.letras.mus.br/joao-gomes/flor-de-tangerina/
public class Musica {
    public Musica() {
    }

    public static void main(String[] args) {
        Sonho sonho = new Sonho();
        Luz luz = new Luz();
        Flor flor = new Flor();
        sonho.pessoa_principal = "eu";
        sonho.pessoa_secundario = "ela";
        sonho.acao = "voltava";
        sonho.realizado = false;
        flor.nome = "tangerina";
        if (sonho.realizado) {
            sonho.sonhar();
            luz.iluminar();
            flor.exalarPerfume();
        } else {
            System.out.println("Não sonhou e nem cantou");
        }

    }
}