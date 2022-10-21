package com.mycompany.pratica.relacionamento.contacorrente;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("João");
        
        conta1.depositar(150.0, 10, 01, 2022);
        conta1.depositar(350.0, 10, 01, 2022);
        conta1.sacar(80.0, 10, 02, 2022);
        conta1.depositar(100.0, 10, 04, 2022);
        conta1.sacar(450.0, 10, 05, 2022);
        conta1.depositar(150.0, 10, 06, 2022);
        
        conta1.exibirExtrato();
    }
}
