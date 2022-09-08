package com.mycompany.lista4_01221076_pauloenrique;

import java.util.Scanner;

public class AppEncomenda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        Encomenda encomenda = new Encomenda();
        
        System.out.println("Informe a distância: ");
        encomenda.distancia = leitor.nextDouble();
        
        System.out.println("Informe o valor da encomenda: ");
        encomenda.valorEncomenda = leitor.nextDouble();

        System.out.println("Informe o tamanho: ");
        encomenda.tamanho = leitor.next();        
        
        System.out.println("Informe o endereço do remetente: ");
        encomenda.enderecoRemetente = leitor.next();        

        System.out.println("Informe o endereço do destinatário: ");
        encomenda.enderecoDestinatario = leitor.next();                
        
        
        System.out.println("Valor do frete é R$ " + encomenda.calcularFrete());
        
        encomenda.emitirEtiqueta();
    }
}
