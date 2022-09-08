package com.mycompany.lista4_01221076_pauloenrique;

import java.util.Scanner;

public class AppBolo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        Bolo morango = new Bolo();
        morango.sabor = "morango";
        morango.valor = 35.00;
        
        Bolo abacaxi = new Bolo();
        abacaxi.sabor = "abacaxi";
        abacaxi.valor = 30.00;
        
        Bolo chocolate = new Bolo();
        chocolate.sabor = "chocolate";
        chocolate.valor = 45.00;        
        
        for(int i=0; i<3 ; i++){
            System.out.println("Informe quantos Bolos de Morango você quer comprar:");
            Integer qtdBolo = leitor.nextInt();
            morango.comprarBolo(qtdBolo);
            morango.exibirRelatorio();
        }
        
        for(int i=0; i<3 ; i++){
            System.out.println("Informe quantos Bolos de Abacaxi você quer comprar:");
            Integer qtdBolo = leitor.nextInt();
            abacaxi.comprarBolo(qtdBolo);
            abacaxi.exibirRelatorio();
        }

        for(int i=0; i<3 ; i++){
            System.out.println("Informe quantos Bolos de Chocolate você quer comprar:");
            Integer qtdBolo = leitor.nextInt();
            chocolate.comprarBolo(qtdBolo);
            chocolate.exibirRelatorio();
        }        
        
        
    }
}
