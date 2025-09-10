package org.atividades.atividade4;

public class Pessoa {
    String nome;
    String idade;
    String altura;
    String genero;

    void imprimirInformacoes() {
        System.out.println("Nome: " + nome + "Idade: " + idade + "Altura: " + altura);
    }
    void andar(){
        System.out.println(nome + "está caminhando");
    }
    void dormir(){
        System.out.println(nome + "está dormindo");
    }
}
