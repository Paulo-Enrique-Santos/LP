package com.mycompany.poo;

public class ContaCorrente {
    //ATRIBUTOS DE UMA CONTA CORRENTE
    String titular;
    Double saldo= 0.0;
    String numero;

    void depositar(Double saldo){
        this.saldo += saldo;
    }
    
    Double sacar(Double valor){
        return saldo -= valor;
    }
    
    String getSituacao(){
        if(saldo > 5000.0){
            return "Ta de boa...";
        } else if(saldo > 500.0){
            return "Economize...";
        } else {
            return "ta osso...";
        }
    }
}
