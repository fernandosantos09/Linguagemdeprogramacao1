package org.atividades.atividade3.TheBearerIrma;

public class Missao {
    int ponto_inicial;
    int ponto_final;
    int concluido;

    void iniciarMissao(){
        if(concluido >= ponto_inicial){
            System.out.println("Missao iniciada");
        }
        else{
            System.out.println("Missao finalizada ou já iniciada");
        }
    }
    void finalizarMissao(){
        if(concluido == ponto_final){
            System.out.println("Missao finalizada");
        }
        else{
            System.out.println("Missao não finalizada");
        }
    }
}
