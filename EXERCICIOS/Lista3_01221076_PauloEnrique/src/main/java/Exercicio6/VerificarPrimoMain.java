package Exercicio6;

import java.util.Scanner;

public class VerificarPrimoMain {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Informe um número: ");
        Integer numero = leitor.nextInt();
        
        VerificarPrimo verificar = new VerificarPrimo();
        
        verificar.isPrimo(numero);
        while(numero > 0){
            System.out.println("Informe um número: ");
            numero = leitor.nextInt();
            verificar.isPrimo(numero);
        }
    }
}
