package org.atividades.atividade3.Lampedusa.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.atividades.atividade3.Lampedusa.controller.ControllerLampedusa;

public class ViewLampedusa extends Application {

    @Override
    public void start(Stage stage) {

        // Inputs Barco
        TextField txtTipoBarco = new TextField();
        txtTipoBarco.setPromptText("Tipo do Barco");

        TextField txtTamanho = new TextField();
        txtTamanho.setPromptText("Tamanho do Barco");

        TextField txtSimbolo = new TextField();
        txtSimbolo.setPromptText("Símbolo do Barco");

        // Inputs Instalacao
        TextField txtTitulo = new TextField();
        txtTitulo.setPromptText("Título da Instalação");

        TextField txtLocal = new TextField();
        txtLocal.setPromptText("Local da Instalação");

        TextField txtMaterial = new TextField();
        txtMaterial.setPromptText("Material da Instalação");

        // Inputs Publico
        TextField txtPessoas = new TextField();
        txtPessoas.setPromptText("Número de Pessoas");

        TextField txtEmocao = new TextField();
        txtEmocao.setPromptText("Emoção");

        CheckBox chkImpactado = new CheckBox("Impactado");

        // Output
        TextArea output = new TextArea();
        output.setEditable(false);

        // Botão
        Button btnExecutar = new Button("Executar e Salvar CSV");

        btnExecutar.setOnAction(e -> {
            try {
                String tipoBarco = txtTipoBarco.getText();
                double tamanho = Double.parseDouble(txtTamanho.getText());
                String simbolo = txtSimbolo.getText();

                String titulo = txtTitulo.getText();
                String local = txtLocal.getText();
                String material = txtMaterial.getText();

                int pessoas = Integer.parseInt(txtPessoas.getText());
                String emocao = txtEmocao.getText();
                boolean impactado = chkImpactado.isSelected();

                // Chamar controller
                ControllerLampedusa.processar(tipoBarco, tamanho, simbolo,
                        titulo, local, material,
                        pessoas, emocao, impactado);

                output.setText("Execução concluída e CSV gerado!");
            } catch (NumberFormatException ex) {
                output.setText("Erro: valores numéricos incorretos.");
            }
        });

        VBox layout = new VBox(10,
                txtTipoBarco, txtTamanho, txtSimbolo,
                txtTitulo, txtLocal, txtMaterial,
                txtPessoas, txtEmocao, chkImpactado,
                btnExecutar, output
        );

        Scene scene = new Scene(layout, 400, 500);
        stage.setTitle("Atividade 3 - Lampedusa");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
