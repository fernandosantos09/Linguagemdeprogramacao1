import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o valor 01: ");
    double valor1 = input.nextDouble();
    System.out.println("Digite o valor 02: ");
    double valor2 = input.nextDouble();
    if (valor1 > valor2){
        System.out.println("Em ordem: " + valor2 + " " + valor1);
    }
    else{
        System.out.println("Em ordem: " + valor1 + " " + valor2);
    }

    }
    
}
//Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente. 