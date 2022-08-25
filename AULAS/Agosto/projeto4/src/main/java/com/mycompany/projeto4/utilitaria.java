
package com.mycompany.projeto4;


public class utilitaria {
    /*
        O método é composto por:
        - retorno
            nesse caso abaixo, não retorna;
        - nome
        - arumentos
    */
    
    void exibirLinha(){
        System.out.println("-".repeat(30));
    }
    
    void exibirNomeDecorado(String nome){
        System.out.printf("\n*** %s ***", nome);
    }
    
    void exibirNomeDecoradoComLinha(String texto){
        exibirLinha();
        exibirNomeDecorado(texto);
        exibirLinha();
    }
}
