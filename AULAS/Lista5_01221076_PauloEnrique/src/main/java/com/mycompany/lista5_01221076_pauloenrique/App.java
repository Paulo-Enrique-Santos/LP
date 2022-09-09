package com.mycompany.lista5_01221076_pauloenrique;

public class App {
    public static void main(String[] args) {
        Colaborador colaborador1 = new Colaborador("Paulo", "Desenvolvedor", 5000.0);
        Colaborador colaborador2 = new Colaborador("Giovanna", "Biomédica", 3000.0);
        
        RecursosHumanos rh = new RecursosHumanos();
        
        System.out.println(colaborador1.getNome());
        System.out.println(colaborador1.getCargo());
        System.out.println(colaborador1.getSalario());
        
        System.out.println(colaborador2.getNome());
        System.out.println(colaborador2.getCargo());
        System.out.println(colaborador2.getSalario());        
        
        rh.promoverColaborador(colaborador1,"Desenvolvedor Júnior", 7000.0);
        rh.promoverColaborador(colaborador1,"Desenvolvedor Estagiário", 4000.0);
        
        rh.reajustarSalario(colaborador2, 0.1);
        
        System.out.println(colaborador1.getNome());
        System.out.println(colaborador1.getCargo());
        System.out.println(colaborador1.getSalario());
        
        System.out.println(colaborador2.getNome());
        System.out.println(colaborador2.getCargo());
        System.out.println(colaborador2.getSalario());       
        
        System.out.println(rh.getTotalPromovidos());
        System.out.println(rh.getTotalSalarios());
    }
}
