package com.mycompany.projeto.vendedor;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<VendedorComissao> vendedores;

    public Departamento(String nome) {
        this.nome = nome;
        this.vendedores = new ArrayList<>();
    }
    
    public void adicionaVendedor(VendedorComissao vendedor) {
        this.vendedores.add(vendedor);
    }
    
    public Integer countVendedores(){
        return vendedores.size();
    }
    
    public Double getTotalSalario(){
        Double totalSalario = 0.0;
        
        for (VendedorComissao vendedor : vendedores) {
            totalSalario += vendedor.calcularSalario();
        }
        
        return totalSalario;
    }
    
    public Integer countQuantidadeContratados(){
        Integer total = 0;
        
        for (VendedorComissao vendedor : vendedores) {
            if(vendedor instanceof VendedorComissaoMaisFixo){
                
                // TROCAR TIPO DO OBJETO PARA O OBJETO FILHO (CAST)
                // SERVE PARA CASO EU QUEIRA ACESSAR ALGUM MÉTODO DO OBJETO FILHO
                VendedorComissaoMaisFixo vendedorComissaoMaisFixo = 
                        (VendedorComissaoMaisFixo) vendedor;
                
                total++;
            }
        }
        return total;
    }
}
