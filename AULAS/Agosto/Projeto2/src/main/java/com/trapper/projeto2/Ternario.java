
package com.trapper.projeto2;

public class Ternario {
    public static void main(String[] args) {
        String frase;
        
        Boolean isMatriculado = true;
        
        /*if(isMatriculado){
            frase = "Está matriculado";
        } else {
            frase = "Não está matriculado";
        }*/
        
        frase = isMatriculado ? "Está matriculado" : "Não está matriculado";      
        
        System.out.println(frase);
        
        Integer numero = 42;
        
        String frase2;
        
        frase2 = numero > 10 ? "É maior " : "É menor ";
    }
}
