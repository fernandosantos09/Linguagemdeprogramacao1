package org.atividades.atividade1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewCalculo extends Application {

    @Override
    public void start(Stage stage) {
        TextField txtP1 = new TextField(); txtP1.setPromptText("Digite P1");
        TextField txtE1 = new TextField(); txtE1.setPromptText("Digite E1");
        TextField txtE2 = new TextField(); txtE2.setPromptText("Digite E2");
        TextField txtX = new TextField(); txtX.setPromptText("Digite X");
        TextField txtSub = new TextField(); txtSub.setPromptText("Digite SUB");
        TextField txtApi = new TextField(); txtApi.setPromptText("Digite API");

        Label lblResultado = new Label();
        Button btnCalcular = new Button("Calcular Média");

        btnCalcular.setOnAction(e -> ControllerCalculo.calcularMedia(txtP1, txtE1, txtE2, txtX, txtSub, txtApi, lblResultado));

        VBox layout = new VBox(10, txtP1, txtE1, txtE2, txtX, txtSub, txtApi, btnCalcular, lblResultado);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(layout, 350, 450);
        stage.setTitle("Atividade 1 - Cálculo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
