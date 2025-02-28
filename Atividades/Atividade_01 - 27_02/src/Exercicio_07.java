import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva um numero: ");
        float valor = input.nextInt();
        if (valor > 10){
            System.out.println("É maior que 10!");
        }
            else {
                System.out.println("Não é maior que 10!");
            } 
    }
    
}
//Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10! 