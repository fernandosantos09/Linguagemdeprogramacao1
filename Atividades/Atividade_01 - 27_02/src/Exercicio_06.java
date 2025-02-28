import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Digite o valor em Fahrenheit");
        float fahrenheit = input.nextFloat();
        double conversao = 0.55 * (fahrenheit - 32);
        System.out.println(fahrenheit + " em Fahrenheint equivale a " + conversao + " Celsius");
    }
}
//Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever 
//o valor correspondente em graus Celsius. Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F