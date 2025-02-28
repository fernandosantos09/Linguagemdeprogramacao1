
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Salario: ");
     float salario = input.nextFloat();
     System.out.println("Numeros de carros vendidos: ");  
     float carros = input.nextFloat();
     System.out.println("Valor total de vendas: ");
     float vendas = input.nextFloat();
     double salariovendas = (vendas * 0.05);
     double salariocarros = salario * ((carros / 100));
     double salariototal = salario + salariovendas + salariocarros ;
    
     System.out.println("Valor total recebido é de: " + salariototal);

     // 
    }
}

//Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, 
//mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas.
// Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas,
// o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.