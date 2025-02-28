import java.util.Scanner;

public class Exercicio_01 {
        public static void main(String[] args) {
        int anos, meses, dias ;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade em : ");
        System.out.print("Anos: ");
        anos = input.nextInt() * 365;
        System.out.print("Meses: ");
        meses = input.nextInt() * 30;
        System.out.print("Dias: ");
        dias = input.nextInt();
        int c3 = anos + meses + dias;

        System.out.println("Seus dias na Terra são : " + c3 + " Dias");

        }
}
//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a 
//idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.