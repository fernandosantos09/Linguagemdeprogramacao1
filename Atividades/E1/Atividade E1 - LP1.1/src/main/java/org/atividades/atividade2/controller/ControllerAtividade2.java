package org.atividades.atividade2.controller;

import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.atividades.atividade2.model.*;

public class ControllerAtividade2 {

    private Flor flor;
    private Luz luz;
    private Sonho sonho;

    public ControllerAtividade2() {

    }

    public static void processar(TextField txtPessoaPrincipal, TextField txtPessoaSecundario, TextField txtAcao, CheckBox chkRealizado, TextField txtNomeFlor, TextField txtIntensidadeLuz, Label lblResultado) {
    }

    public void configurarSonho(String principal, String secundario, String acao, boolean realizado) {
        sonho.pessoa_principal = principal;
        sonho.pessoa_secundario = secundario;
        sonho.acao = acao;
        sonho.realizado = realizado;
    }

    public void configurarFlor(String nome, String fragancia, String cor) {
        flor.nome = nome;
        flor.fragancia = fragancia;
        flor.cor = cor;
    }

    public void configurarLuz(String intensidade, String cor, String tipo) {
        luz.intensidade = intensidade;
        luz.cor = cor;
        luz.tipo = tipo;
    }

    public String executar() {
        StringBuilder sb = new StringBuilder();
        if (sonho.realizado) {
            sonho.sonhar();
            luz.iluminar();
            flor.exalarPerfume();
            sb.append("Sonho realizado e flor exalada.\n");
        } else {
            sb.append("Não sonhou e nem cantou.\n");
        }
        return sb.toString();
    }
}
