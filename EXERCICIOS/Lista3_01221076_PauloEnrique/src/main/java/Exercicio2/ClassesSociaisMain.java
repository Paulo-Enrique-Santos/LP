
package Exercicio2;

import java.util.Scanner;


public class ClassesSociaisMain {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Informe a sua renda: ");
        Double renda = leitor.nextDouble();
        
        ClassesSociais classes = new ClassesSociais();
        
        Double salarios = classes.qtdSalarios(renda);
        
        System.out.println("Você recebe " + salarios + " minimos");
        
        
        System.out.println("E você pertence a classe " + classes.classeSocialPertencente(salarios));
    }
}
 