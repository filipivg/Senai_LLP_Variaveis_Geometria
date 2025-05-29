package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double area, raio;
        double pi = 3.14;

        System.out.print("Digite o raio do circulo: ");
        raio = leia.nextInt();

        area = pi * (raio * raio);

        System.out.print("A area do circulo é: " + area);
    }

}
