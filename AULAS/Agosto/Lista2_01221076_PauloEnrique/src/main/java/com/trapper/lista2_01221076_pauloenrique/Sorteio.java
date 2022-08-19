package com.trapper.lista2_01221076_pauloenrique;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um número");
        Integer numero = leitor.nextInt();
        
        Integer primeiroSorteio = 0;
        Integer numerosPares = 0;
        Integer numerosImpares = 0;
        
        for (int i = 1; i <= 200000; i++) {
            Integer numeroRandômico = ThreadLocalRandom.current().nextInt(0,100);
            if(primeiroSorteio == 0 && numeroRandômico == numero){
                primeiroSorteio = i;
            }
            
            if(numeroRandômico % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }
                
        System.out.println("O número foi sorteado pela primeira vez no sorteio: " + primeiroSorteio);
        System.out.println("Numeros Pares: " + numerosPares);
        System.out.println("Numeros Impares: " + numerosImpares);

    }
}
