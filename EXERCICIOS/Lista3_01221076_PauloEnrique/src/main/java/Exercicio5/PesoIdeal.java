package Exercicio5;

public class PesoIdeal {
    void calcularPesoIdeal(String sexo, Double altura){
        if ("M".equals(sexo)) {
            Double peso = ( altura * 72.7)-58;
            System.out.println("O seu peso ideal é: " + peso);
        }
        
        if ("F".equals(sexo)) {
            Double peso = ( altura * 62.1)-44.7;
            System.out.println("O seu peso ideal é: " + peso);            
        }
    }
}
