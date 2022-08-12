package com.mycompany.exercicio_01;

import java.util.Scanner;

public class Condicional {

    /*
        ==
        !=
        &&
        ||
        >
        <
        >=
        <=
        %
    
        ** Potência
        Math.pow(x, y);
    
    
        
     */
    public static void main(String[] args) {
        Integer numero1 = 42;
        Integer numero2 = 41;
        if (numero1 > numero2) {
            System.out.println("Numero " + numero1 + " é maior que " + numero2);
        } else {
            System.out.println("Numero " + numero2 + " é maior que " + numero1);
        }
        
        Boolean isProfessor = false;
        
        if (isProfessor) {
            System.out.println("É professor");
        } else {
            System.out.println("Não é professor");
        }
        
        Scanner leitor = new Scanner(System.in);
        
        String nome1 = "Paulo";
        
        System.out.println("Digite seu nome:");
        String nome2 = leitor.nextLine();
        
        if(nome1.equals(nome2)){
            System.out.println("O Nome é Igual!");
        }
    }

}
