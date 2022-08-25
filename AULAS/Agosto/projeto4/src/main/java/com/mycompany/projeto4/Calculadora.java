
package com.mycompany.projeto4;


public class Calculadora {
    
    Integer exibirSoma(Integer n1, Integer n2){
        System.out.println(n1+n2);
        return n1+n2; 
    }
    
    Boolean isPar(Integer numero){
        return numero % 2 == 0;
    }
    
    Boolean calculaEVerifica(Integer n1, Integer n2){
        Integer resultado = exibirSoma(n1, n2);
        return isPar(resultado);
    }
    
    /*
    SOBRECARGA É USAR O MÉTODO COM O MESMO NOME, PORÉM COM TIPAGEM DIFERENTES.
    
    SOBRECARGA NÃO FUNCIONA COM VOID
    */   
    
}
