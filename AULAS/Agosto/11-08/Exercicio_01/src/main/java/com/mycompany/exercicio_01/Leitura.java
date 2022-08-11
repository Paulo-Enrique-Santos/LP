
package com.mycompany.exercicio_01;

import java.util.Scanner;


public class Leitura {
    public static void main(String[] args) {

        //ASSISTENTE PARA CAPTURA DE DADOS INSERIDOS NO CONSOLE
        Scanner leitorTexto = new Scanner (System.in);
        Scanner leitorNumerico = new Scanner (System.in);
        
        System.out.println("Digite seu nome:");
        String nomeDigitado = leitorTexto.nextLine();
        
        System.out.println("Digite sua Idade:");
        Integer idadeDigitada = leitorNumerico.nextInt();        
        
        System.out.println("Olá " + nomeDigitado + ", vi que você tem " + idadeDigitada + " anos.");
        
        System.out.println("Digite sua Altura:");
        Double alturaDigitada = leitorNumerico.nextDouble();
        
        System.out.println("Vi também que a sua altura é: " + alturaDigitada);
    }
}
