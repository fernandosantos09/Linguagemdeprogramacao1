import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Escreva um numero: ");
        float valor = input.nextInt();  
        if (valor >= 0) {
           System.out.println("Valor é positivo"); 
        } 
        else{
            System.out.println("Valor é negativo");
        }
    }
}
//Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). 