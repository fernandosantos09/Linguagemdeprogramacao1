package org.atividades.atividade1;

public class Calculo {
    double p1;
    double e1;
    double e2;
    double x;
    double sub;
    double api;

    double calculoMediaMateria() {
        double c1 = p1 * 0.5 + e1 * 0.2 + e2 * 0.3 + sub * 0.15 + x;
        double c2;
        if(c1 > 5.9){
            c1 = c1 * 0.5;
            c2 = c1 + api * 0.5;
        }
        else{
            c2 = c1 * 0.5 ;
        }
        System.out.println("A média final é: " + c2);
        return c2;
    }
}
