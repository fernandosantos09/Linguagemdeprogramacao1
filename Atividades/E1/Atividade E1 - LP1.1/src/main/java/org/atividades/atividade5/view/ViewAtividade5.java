package org.atividades.atividade5.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.atividades.atividade5.controller.ControllerAtividade5;
import org.atividades.atividade5.model.Duna;
import org.atividades.atividade5.model.Rocha;
import org.atividades.atividade5.model.Vento;

public class ViewAtividade5 extends Application {

    @Override
    public void start(Stage stage) {
        TextField txtAltura = new TextField(); txtAltura.setPromptText("Altura da Duna");
        TextField txtLargura = new TextField(); txtLargura.setPromptText("Largura da Duna");
        TextField txtTipo = new TextField(); txtTipo.setPromptText("Tipo de Duna");

        TextField txtMaterial = new TextField(); txtMaterial.setPromptText("Material da Rocha");
        TextField txtDureza = new TextField(); txtDureza.setPromptText("Dureza da Rocha");
        TextField txtAreaExposta = new TextField(); txtAreaExposta.setPromptText("Área Exposta da Rocha");

        TextField txtVelocidade = new TextField(); txtVelocidade.setPromptText("Velocidade do Vento");
        TextField txtDirecao = new TextField(); txtDirecao.setPromptText("Direção do Vento");
        TextField txtIntensidade = new TextField(); txtIntensidade.setPromptText("Intensidade do Vento");

        TextArea output = new TextArea(); output.setEditable(false);
        Button btnSalvar = new Button("Executar e Gerar CSV");

        btnSalvar.setOnAction(e -> {
            try {
                Duna duna = new Duna(Double.parseDouble(txtAltura.getText()),
                        Double.parseDouble(txtLargura.getText()),
                        txtTipo.getText());

                Rocha rocha = new Rocha(txtMaterial.getText(),
                        Double.parseDouble(txtDureza.getText()),
                        Double.parseDouble(txtAreaExposta.getText()));

                Vento vento = new Vento(Double.parseDouble(txtVelocidade.getText()),
                        txtDirecao.getText(),
                        Double.parseDouble(txtIntensidade.getText()));

                ControllerAtividade5.executar(duna, rocha, vento);

                output.setText("Duna: " + txtAltura.getText() + " x " + txtLargura.getText() + ", Tipo: " + txtTipo.getText() + "\n" +
                        "Rocha: " + txtMaterial.getText() + ", Dureza: " + txtDureza.getText() + ", Área: " + txtAreaExposta.getText() + "\n" +
                        "Vento: " + txtVelocidade.getText() + " km/h, Direção: " + txtDirecao.getText() + ", Intensidade: " + txtIntensidade.getText() + "\n" +
                        "\nCSV salvo com sucesso!");

            } catch (NumberFormatException ex) {
                output.setText("Erro: digite valores numéricos corretos.");
            } catch (Exception ex) {
                output.setText("Erro ao executar: " + ex.getMessage());
            }
        });

        VBox layout = new VBox(10, txtAltura, txtLargura, txtTipo,
                txtMaterial, txtDureza, txtAreaExposta,
                txtVelocidade, txtDirecao, txtIntensidade,
                btnSalvar, output);

        Scene scene = new Scene(layout, 500, 550);
        stage.setTitle("Atividade 5 - Duna, Rocha e Vento");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
