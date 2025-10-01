package org.atividades.atividade3.TheBearerIrma.controller;

import org.atividades.atividade3.TheBearerIrma.model.Pessoa;
import org.atividades.atividade3.TheBearerIrma.model.Recipiente;
import org.atividades.atividade3.TheBearerIrma.model.Missao;

import java.io.FileWriter;
import java.io.IOException;

public class ControllerTheBearer {

    public static void processar(String nome, int idade, double altura,
                                 String tipo, String cor, double volume,
                                 int pontoInicial, int pontoFinal, int concluido,
                                 Appendable output) {

        try {
            // Criar objetos
            Pessoa pessoa = new Pessoa(nome, idade, altura);
            pessoa.cadastrarPessoa();

            Recipiente recipiente = new Recipiente(tipo, volume, cor);
            recipiente.encherRecipiente();

            Missao missao = new Missao(pontoInicial, pontoFinal, concluido);
            missao.iniciarMissao();
            missao.finalizarMissao();

            // Exibir resultados
            output.append("Pessoa: " + pessoa.nome + ", " + pessoa.idade + " anos, " + pessoa.altura + "m\n");
            output.append("Recipiente: " + recipiente.tipo + ", " + recipiente.cor + ", " + recipiente.volume + "L\n");
            output.append("Missão: inicial " + missao.ponto_inicial + ", final " + missao.ponto_final + ", concluído " + missao.concluido + "\n");

            // Salvar CSV
            try (FileWriter csv = new FileWriter("thebearer.csv", true)) {
                csv.append(pessoa.nome).append(",").append(String.valueOf(pessoa.idade)).append(",").append(String.valueOf(pessoa.altura)).append(",");
                csv.append(recipiente.tipo).append(",").append(recipiente.cor).append(",").append(String.valueOf(recipiente.volume)).append(",");
                csv.append(String.valueOf(missao.ponto_inicial)).append(",").append(String.valueOf(missao.ponto_final)).append(",").append(String.valueOf(missao.concluido)).append("\n");
            }

            output.append("\nCSV salvo com sucesso!\n");

        } catch (IOException e) {
            try { output.append("Erro ao salvar CSV.\n"); } catch (IOException ex) {}
        }
    }
}
