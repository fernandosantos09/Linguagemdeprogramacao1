import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int jornada = 40;
    System.out.println("DIGITE AS HORAS TRABALHADAS: ");
    int horas = input.nextInt();
    System.out.println("Digite o salario por hora: ");
    float salariohora = input.nextFloat();
    float salariofixo = salariohora * (40 * 4); // aqui pega salario fixo por ex: R$20 a hora
    double salarioextra = ((horas - jornada) * (salariohora * 1.5)); // pega as horas a+ vezes 50% do valor da hora 
    double salariototal = salariofixo + salarioextra; // soma os 2
    System.out.println("Salario total é: " + salariototal + " as horas extras são " + salarioextra);

    }
}
//A jornada de trabalho semanal de um funcionário é de 40 horas. 
//O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
//Escreva um algoritmo que leia o número de horas trabalhadas em um mês, 
//o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, 
//caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas). 
