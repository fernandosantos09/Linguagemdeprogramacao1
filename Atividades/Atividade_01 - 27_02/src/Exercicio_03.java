import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o valor do salario: ");
    float salario =  input.nextFloat();
    System.out.print("Digite o valor do reajuste: "); // considerando que vai entrar um valor ex: 15%, no caso somente o 15
    float reajuste = input.nextFloat();
    float novosalario = salario * (1 + (reajuste/100));
    System.out.print("Novo salario é: " + novosalario);

    }
}
//Escreva um algoritmo para ler o salário mensal atual de um funcionário 
//e o percentual de reajuste. Calcular e escrever o valor do novo salário. 
