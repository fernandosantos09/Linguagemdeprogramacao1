package org.atividades.atividade3.TheBearerIrma.model;

public class Missao {
    public int ponto_inicial;
    public int ponto_final;
    public int concluido;

    public Missao(int ponto_inicial, int ponto_final, int concluido) {
        this.ponto_inicial = ponto_inicial;
        this.ponto_final = ponto_final;
        this.concluido = concluido;
    }

    public void iniciarMissao(){
        if(concluido >= ponto_inicial){
            System.out.println("Missao iniciada");
        } else {
            System.out.println("Missao finalizada ou já iniciada");
        }
    }

    public void finalizarMissao(){
        if(concluido == ponto_final){
            System.out.println("Missao finalizada");
        } else {
            System.out.println("Missao não finalizada");
        }
    }
}
