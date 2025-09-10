package org.atividades.atividade1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculo luis = new Calculo();
        System.out.println("Digite um valor para P1: ");
        luis.p1 = sc.nextDouble();
        System.out.println("Digite um valor para E1: ");
        luis.e1 = sc.nextDouble();
        System.out.println("Digite um valor para E2: ");
        luis.e2 = sc.nextDouble();
        System.out.println("Digite um valor para X: ");
        luis.x = sc.nextDouble();
        System.out.println("Digite um valor para SUB: ");
        luis.sub = sc.nextDouble();
        System.out.println("Digite um valor para API: ");
        luis.api = sc.nextDouble();
        luis.calculoMediaMateria();
    }


}
