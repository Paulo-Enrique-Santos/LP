package com.mycompany.lista5_01221076_pauloenrique;

public class Colaborador {
    private String nome;
    private String cargo;
    private Double salario;

    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public Double getSalario () {
        return this.salario;
    }

    public void setSalario (Double salario) {
        this.salario = salario;
    }
    
    public String getCargo () {
        return this.cargo;
    }

    public void setCargo (String cargo) {
        this.cargo = cargo;
    }
    
    public String getNome () {
        return this.nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }    
}
