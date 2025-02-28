import java.util.Scanner;
public class Exercicio_04 {
        public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.println("Digite o valor do veiculo: ");

        float custof = input.nextFloat();
        double valorfinal = (custof * 1.28) * 1.45 ;
        System.out.println("O custo do consumidor final é:" + valorfinal);

}
}
//O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e
// dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% 
//e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
// calcular e escrever o custo final ao consumidor. 