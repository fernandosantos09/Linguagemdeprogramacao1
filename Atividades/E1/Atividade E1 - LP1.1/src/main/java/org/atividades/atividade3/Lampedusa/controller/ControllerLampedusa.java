package org.atividades.atividade3.Lampedusa.controller;

import org.atividades.atividade3.Lampedusa.model.Barco;
import org.atividades.atividade3.Lampedusa.model.Instalacao;
import org.atividades.atividade3.Lampedusa.model.Publico;

import java.io.FileWriter;
import java.io.IOException;

public class ControllerLampedusa {

    public static void processar(String tipoBarco, double tamanho, String simbolo,
                                 String titulo, String local, String material,
                                 int pessoas, String emocao, boolean impactado) {

        // Criar objetos
        Barco barco = new Barco(tipoBarco, tamanho, simbolo);
        Instalacao instalacao = new Instalacao(titulo, local, material);
        Publico publico = new Publico(pessoas, emocao, impactado);

        // Executar métodos (simulação)
        barco.mostrar();
        barco.flutuar();
        barco.contrastar();

        instalacao.exibir();
        instalacao.refletir();
        instalacao.registrar();

        publico.reagir();
        publico.refletir();
        publico.compartilhar();

        // Salvar CSV
        try (FileWriter csv = new FileWriter("atividade3_lampedusa.csv", true)) {
            csv.append(tipoBarco).append(",")
                    .append(String.valueOf(tamanho)).append(",")
                    .append(simbolo).append(",")
                    .append(titulo).append(",")
                    .append(local).append(",")
                    .append(material).append(",")
                    .append(String.valueOf(pessoas)).append(",")
                    .append(emocao).append(",")
                    .append(String.valueOf(impactado))
                    .append("\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar CSV: " + e.getMessage());
        }
    }
}
