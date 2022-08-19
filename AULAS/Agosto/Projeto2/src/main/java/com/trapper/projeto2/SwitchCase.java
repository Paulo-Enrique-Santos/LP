
package com.trapper.projeto2;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner texto = new Scanner (System.in);
        
        System.out.println("Digite um número");
        Integer numeroDigitado = texto.nextInt();
        
        String frase;
        
        switch (numeroDigitado) {
            case 1:
                frase = "Domingou";
                break;
            case 2:
                frase = "Segunda";
                break;
            case 3:
                frase = "Terça";
                break;
            case 4:
                frase = "Quarta";
                break;
            case 5:
                frase = "Quinta";
                break;
            case 6:
                frase = "Sexta";
                break;
            case 7:
                frase = "Sabado";
                break;
            default:
                frase = "Opção não encontrada";
                break;
        }
        
        System.out.println(frase);
    }
}
