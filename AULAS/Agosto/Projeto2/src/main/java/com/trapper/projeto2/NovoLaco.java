
package com.trapper.projeto2;

import java.util.Scanner;

public class NovoLaco {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Integer numero = 42;
        
        System.out.println("Acerte o número:");
        Integer numeroDigitado = leitor.nextInt();
        
        while(numeroDigitado != numero){
            System.out.println("Errado, Digite novamente:");
            numeroDigitado = leitor.nextInt();
        }
        
        System.out.println("Acertou Parabéns");
    }
}
