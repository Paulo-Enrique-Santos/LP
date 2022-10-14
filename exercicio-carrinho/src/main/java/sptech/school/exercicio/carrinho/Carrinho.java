package sptech.school.exercicio.carrinho;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        produtos = new ArrayList<Produto>();
    }
    
    public Integer getQuantidade(){
        return produtos.size();
    }
    
    public void adicionar(Produto produto){
        produtos.add(produto);
    }
    
    public Boolean existsPorName(String nome){
        for (Produto produto : produtos){
            if(produto.getNome().equals(nome)) {
             return true;   
            }
        }
        return false;
    }
    
    public Integer getQuantidadePorCategoria(String categoria){
        Integer quantidadeCategoria = 0;
        
        for (Produto produto : produtos){
            if(produto.getCategoria().equals(categoria)){
                quantidadeCategoria++;
            }
        }
        return quantidadeCategoria;
    }
    
    public void limpar(){
        produtos.clear();
    }
    
    public void removerPorNome(String nome){
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            
            if(produto.getNome().equals(nome)){
                produtos.remove(i);
            }
        }
    }
    
    public Produto getPorNome(String nome){
        for (Produto produto : produtos) {
            if(produto.getNome().equals(nome)){
                return produto;
            }
        }
        return null;
    }
    
    public Double getValorTotal(){
        Double valorTotal = 0.0;
        
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }
        
        return valorTotal;
    }
}
