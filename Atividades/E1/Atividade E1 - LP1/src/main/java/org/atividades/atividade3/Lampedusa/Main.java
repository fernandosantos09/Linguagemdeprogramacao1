package org.atividades.atividade3.Lampedusa;

public class Main {
    public static void main(String[] args) {
        // Objeto da instalação
        Instalacao inst = new Instalacao();
        inst.titulo = "Lampedusa";
        inst.local = "Bienal de Veneza";
        inst.material = "jornais ampliados";
        inst.exibir();
        inst.refletir();
        inst.registrar();


        Barco barco = new Barco();
        barco.tipo = "origami";
        barco.tamanho = 14.0;
        barco.simbolo = "crise migratória";
        barco.mostrar();
        barco.flutuar();
        barco.contrastar();


        Publico publico = new Publico();
        publico.pessoas = 120;
        publico.emocao = "empatia e tristeza";
        publico.impactado = true;
        publico.reagir();
        publico.refletir();
        publico.compartilhar();
    }
}
