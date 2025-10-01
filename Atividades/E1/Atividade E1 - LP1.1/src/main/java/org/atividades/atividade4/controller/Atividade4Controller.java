package org.atividades.atividade4.controller;

import org.atividades.atividade4.model.Animal;
import org.atividades.atividade4.model.Pessoa;
import org.atividades.atividade4.model.Veiculo;

import java.io.FileWriter;
import java.io.IOException;

public class Atividade4Controller {

    public static void salvarDados(Animal animal, Pessoa pessoa, Veiculo veiculo) throws IOException {
        try (FileWriter csv = new FileWriter("atividade4.csv", true)) {
            csv.append(animal.nome).append(",");
            csv.append(pessoa.nome).append(",");
            csv.append(veiculo.marca).append(",")
                    .append(veiculo.modelo).append(",")
                    .append(veiculo.cor).append(",")
                    .append(veiculo.tipo).append("\n");
        }
    }

    public static void executarAcoes(Animal animal, Pessoa pessoa, Veiculo veiculo) {
        animal.andar();
        animal.alimentar();
        animal.brincar();

        pessoa.andar();
        pessoa.dormir();

        veiculo.andando();
        veiculo.estacionando();
    }
}
