package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;
public class retangulo {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    
    double area,base,altura;

    System.out.print("Digite a base do retangulo: ");
    base = leia.nextInt();
    System.out.print("Digite a altura do retangulo: ");
    altura = leia.nextInt();

    area = base * altura;

    System.out.print("A area do retangulo é: " + area);
    }
    
    
}
