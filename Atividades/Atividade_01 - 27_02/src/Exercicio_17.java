import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota da P1: ");
        float P1 = input.nextFloat();
        System.out.print("Digite a nota da E1: ");
        float E1 = input.nextFloat();
        System.out.print("Digite a nota da E2: ");
        float E2 = input.nextFloat();
        System.out.print("Quantos pontos extras? ");
        float extra = input.nextFloat();
        System.out.print("Qual a nota da API: ");
        float api = input.nextFloat();

       
        double mediaPrincipal = (P1 * 0.6 + ((E1 + E2) / 2) * 0.4);
        double notaParcial = mediaPrincipal * 0.5;


        double ajuste = Math.max(mediaPrincipal - 5.9, 0);
        double impactoAPI = 0;


        if (ajuste > 0) {
            impactoAPI = (ajuste / (mediaPrincipal - 5.9)) * (api * 0.5);
        }

       
        float sub = 0;
        double notaFinal;

     
        if ((notaParcial + impactoAPI + extra) < 6) {
            System.out.print("Qual sua nota na SUB: ");
            sub = input.nextFloat();
        }

       
        notaFinal = notaParcial + impactoAPI + extra + (sub * 0.3);

  
        if (notaFinal >= 6) {
            System.out.printf("Aprovado, ");
           System.out.println(" Média final:" + notaFinal);
        } else {
            System.out.printf("Reprovado, ");
            System.out.println(" Média final:" + notaFinal);
        }


    }
}

//Programa que leia as notas e calcule a média de LP1 deste semestre, referente a um determinado aluno.

//Fórmula para cálculo de média de LP1.
//(P1*0.6+((E1+E2)/2)*0.4)*0.5+(max(((P1*0.6+((E1+E2)/2)*0.4)-5.9),0)/((P1*0.6+((E1+E2)/2)*0.4)-5.9))*(API*0.5)+X+(SUB*0.3)