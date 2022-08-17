package com.mycompany.lista1_01221076_pauloenrique;

import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);
        
        System.out.println("Informe o limite de peso no elevador");
        Double limitePeso = numero.nextDouble();

        
        System.out.println("Informe o limite de pessoas no elevador");
        Integer limitePessoas = numero.nextInt();
        
        System.out.println("Informe o peso da 1ª pessoa");
        Double pesoPessoa1 = numero.nextDouble();
        
        System.out.println("Informe o peso da 2ª pessoa");
        Double pesoPessoa2 = numero.nextDouble();

        System.out.println("Informe o peso da 3ª pessoa");
        Double pesoPessoa3 = numero.nextDouble();        
        
        String frase = String.format( "Entraram 3 pessoas no elevador, no "
        + "qual cabem %d pessoas.\n O peso total no elevador é de %.2f, sendo que ele suporta %.2f",
        limitePessoas, (pesoPessoa1 + pesoPessoa2 + pesoPessoa3),limitePeso);
        
        System.out.println(frase);
    }
}
