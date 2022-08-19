
package com.trapper.lista2_01221076_pauloenrique;

import java.util.Scanner;


public class Acumulador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        Integer somaTotal = 0;
        
        System.out.println("Informe um número");
        Integer numeroDigitado = leitor.nextInt();
        
        while(numeroDigitado != 0){
            somaTotal += numeroDigitado;
            System.out.println("Informe um número");
            numeroDigitado = leitor.nextInt();
        }
        
        System.out.println("A Soma total dos números foi: " + somaTotal);
    }
}
