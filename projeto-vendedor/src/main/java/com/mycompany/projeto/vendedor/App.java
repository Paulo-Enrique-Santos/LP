package com.mycompany.projeto.vendedor;

public class App {
  public static void main(String[] args) {
    VendedorComissao vendedorComissao = new VendedorComissao(1, "Paulo", 10000.00, 10.0);
    
    VendedorComissaoMaisFixo vendedorComissaoMaisFixo = new VendedorComissaoMaisFixo(2, "João", 10000.00, 10.0, 1000.0);
    
    System.out.println(vendedorComissao.calcularSalario());
    
    System.out.println("-".repeat(40));
    
    System.out.println(vendedorComissaoMaisFixo.calcularSalario());
  }
}
