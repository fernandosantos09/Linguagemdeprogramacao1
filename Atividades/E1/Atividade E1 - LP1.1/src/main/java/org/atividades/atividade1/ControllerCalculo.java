package org.atividades.atividade1;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ControllerCalculo {

    public static double calcularMedia(TextField txtP1, TextField txtE1, TextField txtE2,
                                       TextField txtX, TextField txtSub, TextField txtApi,
                                       Label lblResultado) {
        try {
            Calculo luis = new Calculo();
            luis.p1 = Double.parseDouble(txtP1.getText());
            luis.e1 = Double.parseDouble(txtE1.getText());
            luis.e2 = Double.parseDouble(txtE2.getText());
            luis.x = Double.parseDouble(txtX.getText());
            luis.sub = Double.parseDouble(txtSub.getText());
            luis.api = Double.parseDouble(txtApi.getText());

            double media = luis.calculoMediaMateria();
            lblResultado.setText("Média final: " + media);

            salvarCSV(luis, media);
            return media;

        } catch (NumberFormatException ex) {
            lblResultado.setText("Erro: digite apenas números.");
            return -1;
        } catch (IOException ex) {
            lblResultado.setText("Erro ao salvar CSV: " + ex.getMessage());
            return -1;
        }
    }

    private static void salvarCSV(Calculo c, double media) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter("calculos.csv", true))) {
            pw.println(c.p1 + "," + c.e1 + "," + c.e2 + "," + c.x + "," + c.sub + "," + c.api + "," + media);
        }
    }
}
