package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;
public class tubo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double area;
        double areaexterna;
        double areainterna;
        double areaextremidade;
        double h, pi = 3.14, raioex, raioin;

        System.out.print("Digite a altura do tubo: ");
        h = leia.nextInt();
        System.out.print("Digite o raio externo do tubo: ");
        raioex = leia.nextInt();
        
        areaexterna = 2 * pi * (raioex * raioex) * h;
        
        System.out.print("Digite o raio interno do tubo: ");
        raioin = leia.nextInt();

        areainterna = 2 * pi * (raioin * raioin) * h;

        areaextremidade = areaexterna - areainterna;
        
        area = areaexterna + areainterna + areaextremidade;

        System.out.print("A area do tubo é: " + area);
    }
    
}
