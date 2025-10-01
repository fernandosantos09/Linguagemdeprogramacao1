package org.atividades.atividade3.TheBearerIrma.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.atividades.atividade3.TheBearerIrma.controller.ControllerTheBearer;

public class ViewTheBearer extends Application {

    @Override
    public void start(Stage stage) {

        // Inputs Pessoa
        TextField txtNome = new TextField(); txtNome.setPromptText("Nome da pessoa");
        TextField txtIdade = new TextField(); txtIdade.setPromptText("Idade");
        TextField txtAltura = new TextField(); txtAltura.setPromptText("Altura (m)");

        // Inputs Recipiente
        TextField txtTipo = new TextField(); txtTipo.setPromptText("Tipo do recipiente");
        TextField txtCor = new TextField(); txtCor.setPromptText("Cor");
        TextField txtVolume = new TextField(); txtVolume.setPromptText("Volume (L)");

        // Inputs Missao
        TextField txtPontoInicial = new TextField(); txtPontoInicial.setPromptText("Ponto inicial");
        TextField txtPontoFinal = new TextField(); txtPontoFinal.setPromptText("Ponto final");
        TextField txtConcluido = new TextField(); txtConcluido.setPromptText("Concluído");

        TextArea output = new TextArea(); output.setEditable(false);

        Button btnSalvar = new Button("Salvar CSV");

        btnSalvar.setOnAction(e -> {
            try {
                ControllerTheBearer.processar(
                        txtNome.getText(),
                        Integer.parseInt(txtIdade.getText()),
                        Double.parseDouble(txtAltura.getText()),
                        txtTipo.getText(),
                        txtCor.getText(),
                        Double.parseDouble(txtVolume.getText()),
                        Integer.parseInt(txtPontoInicial.getText()),
                        Integer.parseInt(txtPontoFinal.getText()),
                        Integer.parseInt(txtConcluido.getText()),
                        (Appendable) output
                );
            } catch (NumberFormatException ex) {
                output.appendText("Erro: números inválidos.\n");
            }
        });

        VBox layout = new VBox(10,
                txtNome, txtIdade, txtAltura,
                txtTipo, txtCor, txtVolume,
                txtPontoInicial, txtPontoFinal, txtConcluido,
                btnSalvar, output
        );

        stage.setScene(new Scene(layout, 500, 550));
        stage.setTitle("Atividade 3 - TheBearerIrma");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
