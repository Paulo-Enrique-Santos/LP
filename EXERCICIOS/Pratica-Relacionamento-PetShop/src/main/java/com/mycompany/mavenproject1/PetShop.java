package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private String nome;
    private Double faturamento;
    private List<Pet> pets;

    public PetShop(String nome) {
        this.nome = nome;
        this.faturamento = 0.0;
        this.pets = new ArrayList();
    }
    
    public void darBanho(Pet pet, Double valor){
        pet.setQtdVisitas(pet.getQtdVisitas() + 1);
        pet.setValorGasto(pet.getValorGasto() + valor);
        this.faturamento += valor;
        pets.add(pet);
    }
    
    public void darBanho(Pet pet, Double valor, Double valorDesconto){
        Double valorReal = valor - valorDesconto;
        
        pet.setQtdVisitas(pet.getQtdVisitas() + 1);
        pet.setValorGasto(pet.getValorGasto() + valorReal);
        this.faturamento += valorReal;
        pets.add(pet);
    }
    
    public String toString(){
        return String.format("Nome: %s"
                + "\n Faturamento: %.2f"
                + "\n Número de Pets: %d", nome,faturamento,pets.size());
    }
}
