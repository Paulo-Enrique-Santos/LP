
package com.mycompany.lista1_01221076_pauloenrique;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);
        Scanner texto = new Scanner (System.in);
        
        System.out.println("Informe seu nome");
        String nome = texto.next();
        
        System.out.println("Informe a primeira nota");
        Double nota1 = numero.nextDouble();
        
        System.out.println("Informe a segunda nota");
        Double nota2 = numero.nextDouble();
        
        String frase = String.format("Olá, %s. Sua média foi de %.1f",nome,((nota1 + nota2)/2));
        
        System.out.println(frase);
    }
}
