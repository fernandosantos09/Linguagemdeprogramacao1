package org.atividades.atividade5.model;

public class Rocha {
    private String material;
    private double dureza;
    private double areaExposta;

    public Rocha(String material, double dureza, double areaExposta) {
        this.material = material;
        this.dureza = dureza;
        this.areaExposta = areaExposta;
    }

    public void serErosionada() {
        System.out.println("A rocha está sendo erodida pelo vento.");
    }

    public void liberarParticulas() {
        System.out.println("A rocha está liberando partículas de areia.");
    }

    public void resistirErosao() {
        System.out.println("A rocha está resistindo à erosão devido à sua dureza.");
    }

    // GETTERS
    public String getMaterial() { return material; }
    public double getDureza() { return dureza; }
    public double getAreaExposta() { return areaExposta; }
}
