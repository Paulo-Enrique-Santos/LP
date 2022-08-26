package Exercicio4;

public class DescontoProgressivo {
    Double calcularDesconto(Integer qtdProdutos, Double precoProduto){
        if (qtdProdutos >= 3) {
            return (qtdProdutos * precoProduto) * 0.7;
        } else if (qtdProdutos >= 2) {
            return (qtdProdutos * precoProduto) * 0.8;
        } else {
            return (qtdProdutos * precoProduto) * 0.9;
        }
    }
    
    void exibirNotaFiscal(Integer qtdProdutos, Double precoProduto, Double valorDesconto) {
        System.out.println("-".repeat(40));
        System.out.printf("Valor do produto:     R$ %.2f\n", precoProduto);
        System.out.printf("Quantidade:     %d\n", qtdProdutos);
        System.out.println("-".repeat(40));
        System.out.printf("Valor com Desconto:     R$ %.2f\n", valorDesconto);
    }
}
