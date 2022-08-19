
package com.trapper.lista2_01221076_pauloenrique;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Loteria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um número");
        Integer numero = leitor.nextInt();
        
        Integer numeroRandômico = ThreadLocalRandom.current().nextInt(0,10);
        
        Integer tentativas = 0;
        
        while (numero != numeroRandômico) {
            tentativas++;
            numeroRandômico = ThreadLocalRandom.current().nextInt(0,10);
        }
        
        String frase;
        
        if(tentativas > 10){
            frase = "É melhor você parar de apostar e ir trabalhar";
        } else if (tentativas >= 4){
            frase =  "Você é sortudo";
        } else {
            frase = "Você é MUITO sortudo";
        }
        
        System.out.println(frase);
    }
}
