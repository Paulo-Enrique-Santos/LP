
package com.mycompany.lista1_01221076_pauloenrique;

import java.util.Scanner;

public class Quisito {
    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);
        
        System.out.println("Informe quantos filhos você tem de 0 a 3 anos");
        Integer filhos3 = numero.nextInt();
        
        System.out.println("Informe quantos filhos você tem de 4 a 16 anos");
        Integer filhos16 = numero.nextInt();

        System.out.println("Informe quantos filhos você tem de 16 a 18 anos");
        Integer filhos18 = numero.nextInt();      
        
        Integer totalFilhos = filhos3 + filhos16 + filhos18;
        Double totalPagamento = (filhos3 * 25.12) + (filhos16 * 15.88) + (filhos18 * 12.44);
        
        String frase = String.format("Você tem um total de %s filhos e vai receber R$%.2f de bolsa", totalFilhos, totalPagamento);
        
        System.out.println(frase);
        
    }
}
