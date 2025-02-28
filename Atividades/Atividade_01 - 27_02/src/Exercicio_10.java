import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Nota da primeira avaliação: ");
    float nota1 = input.nextInt();
    System.out.print("Nota da segunda avaliação: ");
    float nota2 = input.nextInt();

    float media = (nota1 + nota2)/2;

    if(media >= 6){
        System.out.println("Aprovado, a media das notas é : " + media);
    }
    else{
        System.out.println("Reprovado, a media das notas é : " + media );
    }
    }
}
//Ler as notas da 1a. e 2a. avaliações de um aluno. 
//Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado 
//(considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada. 