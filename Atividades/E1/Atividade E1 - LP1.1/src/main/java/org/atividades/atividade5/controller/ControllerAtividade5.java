package org.atividades.atividade5.controller;

import org.atividades.atividade5.model.Duna;
import org.atividades.atividade5.model.Rocha;
import org.atividades.atividade5.model.Vento;

import java.io.FileWriter;
import java.io.IOException;

public class ControllerAtividade5 {

    public static void executar(Duna duna, Rocha rocha, Vento vento) throws IOException {
        // Executar ações
        duna.acumularAreia();
        rocha.serErosionada();
        vento.transportarAreia();

        // Salvar CSV
        try (FileWriter csv = new FileWriter("atividade5.csv", true)) {
            csv.append(duna.getAltura() + ",")
                    .append(duna.getLargura() + ",")
                    .append(duna.getTipo() + ",")
                    .append(rocha.getMaterial() + ",")
                    .append(rocha.getDureza() + ",")
                    .append(rocha.getAreaExposta() + ",")
                    .append(vento.getVelocidade() + ",")
                    .append(vento.getDirecao() + ",")
                    .append(vento.getIntensidade() + "\n");
        }
    }
}
