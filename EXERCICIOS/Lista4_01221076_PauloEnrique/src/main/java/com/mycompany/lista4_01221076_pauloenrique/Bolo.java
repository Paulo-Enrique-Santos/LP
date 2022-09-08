package com.mycompany.lista4_01221076_pauloenrique;

public class Bolo {
    String sabor;
    Double valor;
    Integer quantidadeVendida = 0;
    
    void comprarBolo(Integer qtdBolo) {
        if(quantidadeVendida + qtdBolo > 100){
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        } else {
            quantidadeVendida += qtdBolo;            
        }
    }
    
    void exibirRelatorio() {
        System.out.println("O bolo sabor " + sabor + ", foi comprado" + quantidadeVendida + "vezes hoje, totalizando R$ " + (valor * quantidadeVendida));
    }
}
