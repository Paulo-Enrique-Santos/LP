
package com.mycompany.lista1_01221076_pauloenrique;

import java.util.Scanner;


public class Produto {
    public static void main(String[] args) {
        Scanner valorReais = new Scanner (System.in);
        Scanner QTD = new Scanner (System.in);
        
        System.out.println("Informe o valor unitário do produto.");
        Double valorProduto = valorReais.nextDouble();
        
        System.out.println("Informe a quantidade vendida.");
        Integer qtdProduto = valorReais.nextInt();
        
        System.out.println("Informe o valor pago pelo cliente.");
        Double valorPago = valorReais.nextDouble();        
        
        Double troco = valorPago - (valorProduto * qtdProduto);
        
        String frase = String.format("Seu troco será de R$ %.2f", troco);
        
        System.out.println(frase);
        
    }
}
