package com.mycompany.lista4_01221076_pauloenrique;

public class AppEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        Empregado empregado2 = new Empregado();
        
        empregado1.nome = "João";
        empregado1.cargo = "Analista de Sistemas";
        empregado1.salario = 5400.00;
        empregado1.reajustarSalario(15);
        
        empregado2.nome = "Paulo";
        empregado2.cargo = "Desenvolvedor";
        empregado2.salario = 5000.00;
        empregado2.reajustarSalario(10);        
    }
}
