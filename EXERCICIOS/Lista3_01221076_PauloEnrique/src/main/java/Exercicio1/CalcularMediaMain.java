
package Exercicio1;

import java.util.Scanner;


public class CalcularMediaMain {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Informe a primeira nota: ");
        Double n1 =leitor.nextDouble();
        
        System.out.println("Informe a segunda nota: ");
        Double n2 =leitor.nextDouble();
        
        CalcularMedia CalcMedia = new CalcularMedia();
        
        Double media = CalcMedia.calcularMedia(n1, n2);
        
        System.out.println("A sua média foi: " + media);
    }
}
