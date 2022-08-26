
package Exercicio3;

import java.util.Scanner;

public class ClassificaldadeMain {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Informe a sua idade: ");
        Integer idade = leitor.nextInt();
        
        Classificaldade classi = new Classificaldade();
        
        classi.classificaldade(idade);
    }
}
