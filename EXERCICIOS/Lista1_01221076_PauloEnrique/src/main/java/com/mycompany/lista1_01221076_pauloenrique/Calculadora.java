
package com.mycompany.lista1_01221076_pauloenrique;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);
        
        System.out.println("Informe um número Real");
        Integer numero1 = numero.nextInt();
        
        System.out.println("Informe outro número Real");
        Integer numero2 = numero.nextInt();    
        
        System.out.println("Resultado da Soma\n" + (numero1 + numero2));
        System.out.println("\nResultado da Substração\n" + (numero1 - numero2));
        System.out.println("\nResultado da Multiplicação\n" + (numero1 * numero2));
        System.out.println("\nResultado da Divisão\n" + (numero1 / numero2));
    }
}
