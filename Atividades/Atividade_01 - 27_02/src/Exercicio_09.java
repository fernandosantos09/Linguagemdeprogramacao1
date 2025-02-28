import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Escreva a quantidade de maças: ");
        int macas = input.nextInt();
        double valor;
        if (macas < 12){
            valor = (1.3 * macas) ;
        }
        else {
            valor = 1 * macas;
        }
    
    System.out.println("O valor total: " + valor);
    }

}
// As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos doze.
// Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.