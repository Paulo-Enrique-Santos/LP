
package com.trapper.lista2_01221076_pauloenrique;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Informe um número para tabuada");
        Integer numeroDigitado = leitor.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(numeroDigitado + " x " + i + " = " + (numeroDigitado * i));
        }
    }
}
