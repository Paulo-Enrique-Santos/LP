package com.mycompany.projeto5;

public class Conta {
    
    String titular;
    String numero;
    Double saldo;
    
    void depositar(Double valor) {
        saldo += valor;
    }
    
    void sacar(Double valor) {
        saldo -= valor;
    }
}
