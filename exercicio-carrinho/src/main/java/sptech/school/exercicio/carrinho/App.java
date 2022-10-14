package sptech.school.exercicio.carrinho;

public class App {
    public static void main(String[] args) {
        
        Produto maca = new Produto("Maça", "Fruta", 5.0);
        Produto sabaoEmPo = new Produto("Sabão em Pó", "Limpeza", 10.50);
        Produto arroz = new Produto("Arroz", "Não perecíveis", 24.99);
        
        Carrinho compra = new Carrinho("Thiago");
        
        compra.adicionar(arroz);
        compra.adicionar(sabaoEmPo);
        compra.adicionar(maca);
        
        System.out.println(compra.getQuantidade() + " Quantidade");
        
        System.out.println(compra.existsPorName("Arroz") + " Exite por Nome");
        
        System.out.println(compra.existsPorName("Arroze") + " Exite por Nome");        
        
        System.out.println(compra.getQuantidadePorCategoria("Fruta") + " Quantidade por Fruta");
        
        Produto banana = new Produto("Banana", "Fruta", 3.8);
        
        compra.adicionar(banana);
        
        System.out.println(compra.getQuantidadePorCategoria("Fruta") + " Quantidade por Fruta");
        
        System.out.println(compra.getPorNome("Banana") + " Get por nome");
        
        System.out.println(compra.getPorNome("Bananas") + " Get por nome");        
        
        System.out.println(compra.getValorTotal() + " Get valor total");
        
        compra.removerPorNome("Banana");
        
        System.out.println(compra.getQuantidade() + " Get Quantidade");
        
        compra.limpar();
        
        System.out.println(compra.getQuantidade() + " Get Quantidade");
        
    }
}
