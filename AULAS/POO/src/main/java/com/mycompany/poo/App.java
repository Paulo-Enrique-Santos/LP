package com.mycompany.poo;

public class App {
    public static void main(String[] args) {
        //ISSO QUE REPRESENTA UM OBJETO
        ContaCorrente conta1 = new ContaCorrente();
        
        conta1.numero = "01221076";
        conta1.titular = "Paulo Enrique";
        System.out.println(conta1.titular);
        conta1.depositar(200.0);
        System.out.println(conta1.saldo);
        System.out.println(conta1.sacar(100.0));
        System.out.println(conta1.saldo);
    }
}
