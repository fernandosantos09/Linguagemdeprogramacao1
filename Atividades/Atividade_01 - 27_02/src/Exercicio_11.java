import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in) ;
    System.out.println("Digite o ano: ");
    int ano = input.nextInt();
    int calculo = 2025 - ano;
    if (calculo >= 16){
        System.out.println("Pode votar !");
    }
    else{
        System.out.println("Não pode votar!");
    }
    }
}
// Ler o ano atual e o ano de nascimento de uma pessoa. 
//Escrever uma mensagem que diga se ela poderá ou não votar este ano 
//(não é necessário considerar o mês em que a pessoa nasceu).