package com.mycompany.lista4_01221076_pauloenrique;

public class Empregado {
    String nome;
    String cargo;
    Double salario;
    
    void reajustarSalario(Integer reajuste){
        salario += (salario * (reajuste/100));
        
        System.out.println("Olá " + nome + " vi que você é " + cargo + " e seu salário reajustado é R$ " + salario);
    }
}
