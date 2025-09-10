package org.atividades.atividade3.TheBearerIrma;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Joao";
        p1.idade = 20;
        p1.altura = 1.88;
        p1.cadastrarPessoa();
        Recipiente r1 = new Recipiente();
        r1.tipo = "balde";
        r1.cor = "Vermelha";
        r1.volume = 5.80;
        Missao m1 = new Missao();
        m1.ponto_inicial = 5;
        m1.iniciarMissao();
        r1.encherRecipiente();
        m1.ponto_final = 6;
        m1.concluido = 6;
        m1.finalizarMissao();
    }
}
