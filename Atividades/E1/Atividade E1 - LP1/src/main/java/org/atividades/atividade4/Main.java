package org.atividades.atividade4;
/*imagem doodle https://www.mauromartins.com/two-dots-the-unexplored */

public class Main {
    public static void main(String[] args) {
        Animal onca  = new Animal();
        onca.nome = "Onca-Pintada";
        onca.andar();
        onca.alimentar();
        onca.brincar();
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Kadu";
        pessoa.andar();
        pessoa.dormir();
        Veiculo carro = new Veiculo();
        carro.modelo = "fiesta";
        carro.cor = "vermelha";
        carro.marca = "ford";
        carro.tipo = "vaza oleo";
        carro.andando();
        carro.estacionando();
   }
}
