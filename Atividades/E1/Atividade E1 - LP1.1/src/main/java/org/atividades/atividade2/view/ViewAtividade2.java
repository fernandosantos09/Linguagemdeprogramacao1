package org.atividades.atividade2.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.atividades.atividade2.controller.ControllerAtividade2;

public class ViewAtividade2 extends Application {

    @Override
    public void start(Stage stage) {
        // Inputs para o Sonho
        TextField txtPessoaPrincipal = new TextField();
        txtPessoaPrincipal.setPromptText("Quem está sonhando?");

        TextField txtPessoaSecundario = new TextField();
        txtPessoaSecundario.setPromptText("Quem aparece no sonho?");

        TextField txtAcao = new TextField();
        txtAcao.setPromptText("Qual ação acontece no sonho?");

        CheckBox chkRealizado = new CheckBox("Sonho realizado?");

        // Inputs para a Flor
        TextField txtNomeFlor = new TextField();
        txtNomeFlor.setPromptText("Nome da flor");

        // Inputs para a Luz
        TextField txtIntensidadeLuz = new TextField();
        txtIntensidadeLuz.setPromptText("Intensidade da luz");

        // Label de resultado
        Label lblResultado = new Label();

        // Botão de ação
        Button btnProcessar = new Button("Processar Sonho");
        btnProcessar.setOnAction(e -> {
            ControllerAtividade2.processar(
                    txtPessoaPrincipal, txtPessoaSecundario, txtAcao, chkRealizado,
                    txtNomeFlor, txtIntensidadeLuz, lblResultado
            );
        });

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(15));
        layout.getChildren().addAll(
                new Label("Detalhes do Sonho:"), txtPessoaPrincipal, txtPessoaSecundario, txtAcao, chkRealizado,
                new Separator(),
                new Label("Detalhes da Flor:"), txtNomeFlor,
                new Separator(),
                new Label("Detalhes da Luz:"), txtIntensidadeLuz,
                btnProcessar, lblResultado
        );

        // Cena
        Scene scene = new Scene(layout, 400, 450);
        stage.setTitle("Atividade 2 - Sonho, Flor e Luz");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
