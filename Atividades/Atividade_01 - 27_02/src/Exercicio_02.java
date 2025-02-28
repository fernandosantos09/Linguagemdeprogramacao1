import java.util.Scanner;
public class Exercicio_02 {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        int brancos = input.nextInt();
        int nulos = input.nextInt();
        int validos = input.nextInt();
        float cbranco = (brancos / total)* 100;
        float cnulos = (nulos / total) * 100;
        float cvalidos = (validos / total) * 100;
        System.out.print("Total" + total + " Brancos " + cbranco +"%" + " Nulos " + cnulos + "%" + " Validos" + cvalidos + "%");



    }
}
//Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. 
//Calcular e escrever o percentual que cada um representa em relação ao total de eleitores. 