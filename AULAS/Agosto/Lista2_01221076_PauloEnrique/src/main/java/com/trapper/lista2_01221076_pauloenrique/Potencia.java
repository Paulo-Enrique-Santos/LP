
package com.trapper.lista2_01221076_pauloenrique;

import java.util.Scanner;


public class Potencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Informe um número para base");
        Integer numeroBase = leitor.nextInt();
        
        System.out.println("Informe um número para potência");
        Integer numeroPotencia = leitor.nextInt();        
        
        Integer resultado = numeroBase;
        for (int i = 0; i < numeroPotencia-1; i++) {
            resultado *= numeroBase;
            
        }
        
        System.out.println("Resultado da potência é: " + resultado);
    }
}
