package Exercicio5;

import java.util.Scanner;

public class PesoIdealMain {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Informe seu gênero");
        String sexo = leitor.nextLine();
        
        System.out.println("Informe sua Altura");
        Double altura = leitor.nextDouble();
        
        PesoIdeal peso = new PesoIdeal();
        
        peso.calcularPesoIdeal(sexo, altura);
    }
}
