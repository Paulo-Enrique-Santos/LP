
package com.mycompany.lista1_01221076_pauloenrique;

import java.util.Scanner;


public class Idade {
    public static void main(String[] args) {
        Scanner texto = new Scanner (System.in);
        Scanner numero = new Scanner (System.in);
        
        System.out.println("Informe seu nome");
        String nome = texto.next();
        
        System.out.println("Olá " + nome + " Qual o ano de seu nascimento?");
        Integer nascimento = numero.nextInt();
        
        System.out.println("Em 2030 você terá " + (2030 - nascimento) + " anos.");
    }
}
