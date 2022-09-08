package com.mycompany.lista4_01221076_pauloenrique;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;
    
    Double calcularFrete() {
        if(tamanho.equals("P")){
            return calcularValor(1);
        } else if (tamanho.equals("M")){
            return calcularValor(3);
        } else if (tamanho.equals("G")){
            return calcularValor(5);
        } else {
            System.out.println("Tamanho indisponível");
        }
        
        return 0.0;
    }
    
    Double calcularValor (Integer porcentagem) {
        if(distancia <= 50) {
            System.out.println("Frete deu: " + (3.00 + (valorEncomenda * (porcentagem/100))));
        } else if (distancia <= 200) {
            System.out.println("Frete deu: " + (5.00 + (valorEncomenda * (porcentagem/100))));
        } else {
            System.out.println("Frete deu: " + (7.00 + (valorEncomenda * (porcentagem/100))));
        }
        
        return 0.0;
    }
    
    void emitirEtiqueta() {
        System.out.println("Endereço do remetente: " + enderecoRemetente);
        System.out.println("Endereço do destinatário: " + enderecoDestinatario);
        System.out.println("Tamanho " + tamanho);
        System.out.println("-".repeat(30));
        System.out.println("Valor encomenda: R$ " + valorEncomenda);
        System.out.println("Valor frete: R$ " + calcularFrete());
        System.out.println("-".repeat(30));
        System.out.println("Valor total: R$ " + (valorEncomenda + calcularFrete()));
    }
    
}
