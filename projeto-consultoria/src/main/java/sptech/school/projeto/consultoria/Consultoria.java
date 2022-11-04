package sptech.school.projeto.consultoria;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> devs;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.devs = new ArrayList<>();
    }   
    
    public Boolean exitePorNome(String nome){
        for (Desenvolvedor dev : devs) {
            if (dev.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public void contratar(Desenvolvedor dev){
        if (vagas > devs.size()) {
            devs.add(dev);
        } else {
            System.out.println("Não temos mais vagas disponíveis");
        }        
    }
    
    public Integer getQuantidadeDevs(){
        return devs.size();
    }
    
    public Integer getQuantidadeDevsMobile(){
        Integer total = 0;
        for (Desenvolvedor dev : devs) {
            if (dev instanceof DesenvolvedorMobile) {
                total++;
            }
        }
        return total;
    }
    
    public Double getTotalSalarios(){
        Double total = 0.0;
        for (Desenvolvedor dev : devs) {
            total += dev.getSalario();
        }
        return total;
    }
    
    public Desenvolvedor getDevPorNome(String nome){
        for (Desenvolvedor dev : devs) {
            if(dev.getNome().equals(nome)){
                return dev;
            }
        }
        return null;
    }
}
