package org.atividades.atividade4.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.atividades.atividade4.controller.Atividade4Controller;
import org.atividades.atividade4.model.Animal;
import org.atividades.atividade4.model.Pessoa;
import org.atividades.atividade4.model.Veiculo;

import java.io.IOException;

public class Atividade4View extends Application {

    @Override
    public void start(Stage stage) {

        // Inputs Animal
        TextField txtAnimalNome = new TextField();
        txtAnimalNome.setPromptText("Nome do animal");

        // Inputs Pessoa
        TextField txtPessoaNome = new TextField();
        txtPessoaNome.setPromptText("Nome da pessoa");

        // Inputs Veículo
        TextField txtVeiculoMarca = new TextField();
        txtVeiculoMarca.setPromptText("Marca do veículo");
        TextField txtVeiculoModelo = new TextField();
        txtVeiculoModelo.setPromptText("Modelo do veículo");
        TextField txtVeiculoCor = new TextField();
        txtVeiculoCor.setPromptText("Cor do veículo");
        TextField txtVeiculoTipo = new TextField();
        txtVeiculoTipo.setPromptText("Tipo do veículo");

        TextArea output = new TextArea();
        output.setEditable(false);

        Button btnSalvar = new Button("Executar e Salvar CSV");

        btnSalvar.setOnAction(e -> {
            try {
                Animal animal = new Animal();
                animal.nome = txtAnimalNome.getText();

                Pessoa pessoa = new Pessoa();
                pessoa.nome = txtPessoaNome.getText();

                Veiculo veiculo = new Veiculo();
                veiculo.marca = txtVeiculoMarca.getText();
                veiculo.modelo = txtVeiculoModelo.getText();
                veiculo.cor = txtVeiculoCor.getText();
                veiculo.tipo = txtVeiculoTipo.getText();

                // Executa ações

                Atividade4Controller.executarAcoes(animal, pessoa, veiculo);

                // Salva CSV
                Atividade4Controller.salvarDados(animal, pessoa, veiculo);

                // Atualiza TextArea
                output.clear();
                output.appendText("Animal: " + animal.nome + "\n");
                output.appendText("Pessoa: " + pessoa.nome + "\n");
                output.appendText("Veículo: " + veiculo.marca + " " + veiculo.modelo + ", " + veiculo.cor + ", " + veiculo.tipo + "\n");
                output.appendText("\nCSV salvo com sucesso!\n");

            } catch (IOException ex) {
                output.appendText("Erro ao salvar CSV.\n");
            }
        });

        VBox layout = new VBox(10,
                txtAnimalNome,
                txtPessoaNome,
                txtVeiculoMarca,
                txtVeiculoModelo,
                txtVeiculoCor,
                txtVeiculoTipo,
                btnSalvar,
                output
        );

        Scene scene = new Scene(layout, 500, 500);
        stage.setTitle("Atividade 4 - Two Dots The Unexplored");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
