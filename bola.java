package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;
public class bola {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double area, raio, pi = 3.14;

        System.out.print("Digite o raio da bola: ");
        raio = leia.nextInt();

        area = 4 * pi + (raio * raio);

        System.out.print("A area da bola é: " + area);
    }
    
}
