package com.mycompany.projeto.vendedor;

public class App {
  public static void main(String[] args) {
    Departamento dept = new Departamento("Eletronicos");
      
    VendedorComissao vendedorComissao = new VendedorComissao(1, "Paulo", 10000.00, 10.0);
    
    VendedorComissaoMaisFixo vendedorComissaoMaisFixo = new VendedorComissaoMaisFixo(2, "João", 10000.00, 10.0, 1000.0);
    
    dept.adicionaVendedor(vendedorComissao);
    dept.adicionaVendedor(vendedorComissaoMaisFixo);
    
    System.out.println("Total Vendedores: " + dept.countVendedores());
    
    System.out.println("-".repeat(40));
    
    System.out.println("Salário Comissão: " + vendedorComissao.calcularSalario());
    
    System.out.println("-".repeat(40));
    
    System.out.println("Salário Fixo: " + vendedorComissaoMaisFixo.calcularSalario());
    
    System.out.println("-".repeat(40));
    
    System.out.println("Total Salário: " + dept.getTotalSalario());
    
    System.out.println("-".repeat(40)); 
    
    System.out.println("Total Contratado: " + dept.countQuantidadeContratados());
  }
}
