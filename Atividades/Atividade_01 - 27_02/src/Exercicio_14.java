import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Inicio: ");
    int inicio = input.nextInt();
    System.out.print("Fim: ");
    int fim = input.nextInt();
    
    int duracao;
    duracao = inicio - fim;
    
    if (duracao < 0 ){
        duracao = duracao * -1;
    }
    
    System.out.print("Esta partida durou: " + duracao);
    
    
    
    }
}
 //Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e 
 //calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 
 //24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
