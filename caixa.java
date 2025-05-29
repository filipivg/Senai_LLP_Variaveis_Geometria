package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;
public class caixa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double area, comp, h, larg;

        System.out.print("Digite o comprimento da caixa: ");
        comp = leia.nextInt();
        System.out.print("Digite a largura da caixa: ");
        larg = leia.nextInt();
        System.out.print("Digite a altura da caixa: ");
        h = leia.nextInt();

        area = 2 * (comp * larg) + 2 * (comp * h) + 2 * (larg * h);

        System.out.print("A area da caixa é: " + area);
    }
    
}
