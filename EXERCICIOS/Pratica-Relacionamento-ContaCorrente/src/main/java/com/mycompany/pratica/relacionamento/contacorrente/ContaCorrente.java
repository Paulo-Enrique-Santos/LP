package com.mycompany.pratica.relacionamento.contacorrente;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    private String titular;
    private Double saldo;
    private List<Historico> extrato;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.extrato = new ArrayList();
    }
    
    public void depositar(Double valor, Integer mes, Integer dia, Integer ano){
        Historico historico = new Historico();
        
        historico.setDia(dia);
        historico.setMes(mes);
        historico.setAno(ano);
        historico.setValor(valor);
        historico.setOperacao("Depósito");
        this.saldo += valor;
        extrato.add(historico);
    }
    
    public void sacar(Double valor, Integer mes, Integer dia, Integer ano){
        Historico historico = new Historico();
        
        historico.setDia(dia);
        historico.setMes(mes);
        historico.setAno(ano);
        historico.setValor(valor);
        historico.setOperacao("Saque");
        this.saldo -= valor;
        extrato.add(historico);
    }
    
    public void exibirExtrato(){
        for(Historico historico : extrato){
            System.out.println(historico.toString());
            System.out.println("-".repeat(10));
        }
            System.out.println("-".repeat(50));
        System.out.println("Saldo Atual: " + this.saldo);
    }
}
