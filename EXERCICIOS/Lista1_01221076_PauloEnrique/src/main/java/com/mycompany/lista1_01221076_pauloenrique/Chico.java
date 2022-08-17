
package com.mycompany.lista1_01221076_pauloenrique;

import java.util.Scanner;

public class Chico {
    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);
        
        System.out.println("Informe seu salário bruto");
        Double salario = numero.nextDouble();
        
        System.out.println("Informe quanto custa sua condução diária");
        Double conducao = numero.nextDouble();

        Double descontos = (salario * 0.10) + (salario *0.20) + ((conducao * 2) * 22); 
        
        String frase = String.format("Seu salário bruto é R$%.2f, tem um total de R$%.2f em descontos e receberá um líquido de R$%.2f", salario, descontos, (salario - descontos));
        
        System.out.println(frase);
    }
}
