package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;
public class piramide {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double area, areabase, areatriangulo, altura, basetriangulo;
        
        System.out.print("Digite a base do triangulo: ");
        basetriangulo = leia.nextInt();
        System.out.print("Digite a altura do triangulo: ");
        altura = leia.nextInt();

        areatriangulo = (basetriangulo * altura) / 2;
        areabase = basetriangulo * basetriangulo;

        area = areabase + 4 * (areatriangulo);

        System.out.print("A area da piramide é: " + area);
    }
}
