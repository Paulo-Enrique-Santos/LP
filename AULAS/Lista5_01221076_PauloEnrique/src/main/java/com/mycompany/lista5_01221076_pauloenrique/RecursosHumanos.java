package com.mycompany.lista5_01221076_pauloenrique;

public class RecursosHumanos {
    private Integer totalPromovidos = 0;
    private Double totalSalarios = 0.0;
    
    public void reajustarSalario(Colaborador colaborador, Double valorReajuste) {
        Double salarioAtual = colaborador.getSalario();
        if (salarioAtual < (valorReajuste * salarioAtual) + salarioAtual) {
            totalSalarios += salarioAtual * valorReajuste;
            colaborador.setSalario((salarioAtual * valorReajuste) + salarioAtual);
        } else {
            System.out.println("operação inválida");
        }
    }
    
    public void promoverColaborador(Colaborador colaborador, String novoCargo, Double salario) {
        Double salarioAtual = colaborador.getSalario();
        if (salarioAtual < salario) {
            totalPromovidos++;
            colaborador.setSalario(salario);
            colaborador.setCargo(novoCargo);
        } else {
            System.out.println("operação inválida");
        }
    }
    
    public Integer getTotalPromovidos() {
        return this.totalPromovidos;
    }
    
    public Double getTotalSalarios() {
        return this.totalSalarios;
    }
}
