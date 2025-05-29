package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double area, base, altura;

        System.out.print("Digite a base do triangulo: ");
        base = leia.nextInt();
        System.out.print("Digite a altura do triangulo: ");
        altura = leia.nextInt();

        area = (base * altura) / 2;

        System.out.print("A area do triangulo é: " + area);
    }
}
