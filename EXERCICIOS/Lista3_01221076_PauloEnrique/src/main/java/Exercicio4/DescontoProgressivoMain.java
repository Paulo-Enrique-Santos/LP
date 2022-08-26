package Exercicio4;

import java.util.Scanner;

public class DescontoProgressivoMain {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Informe a quantidade de produto: ");
        Integer qtdProdutos = leitor.nextInt();
        
        System.out.println("Informe o preço unitário dos produtos: ");
        Double precoProdutos = leitor.nextDouble();
        
        DescontoProgressivo desconto = new DescontoProgressivo();
        
        Double valorDesconto = desconto.calcularDesconto(qtdProdutos, precoProdutos);
        
        desconto.exibirNotaFiscal(qtdProdutos, precoProdutos, valorDesconto);
    }
}
