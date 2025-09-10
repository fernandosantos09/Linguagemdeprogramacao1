package org.atividades.atividade3.Lampedusa;

class Barco {
    String tipo;
    double tamanho;
    String simbolo;

    void mostrar() {
        System.out.println("Barco " + tipo + " de " + tamanho + "m simboliza " + simbolo);
    }

    void flutuar() {
        System.out.println("O barco flutua no canal.");
    }

    void contrastar() {
        System.out.println("Contrasta com os iates de luxo.");
    }
}