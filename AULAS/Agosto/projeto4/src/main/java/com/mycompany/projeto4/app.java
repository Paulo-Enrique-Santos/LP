
package com.mycompany.projeto4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import javax.xml.transform.sax.SAXSource;

public class app {
    public static void main(String[] args) {
        ThreadLocalRandom.current().nextInt(0,100);
        
        utilitaria util = new utilitaria();
        //Funções = Método
        
        util.exibirLinha();
        System.out.println("Paulo");
        util.exibirLinha();
        System.out.println("Enrique");
        util.exibirLinha();
        
        System.out.println("Digite seu nome:");
        Scanner in = new Scanner(System.in);
        String nomeUsuario = in.nextLine();
        
        util.exibirNomeDecorado(nomeUsuario);
        
        System.out.println("\nDigite outro nome:");
        String nomeUsuario2 = in.nextLine();
        
        util.exibirNomeDecorado(nomeUsuario2);
        
        util.exibirNomeDecoradoComLinha(nomeUsuario);
        
        Calculadora calc = new Calculadora();
        
        System.out.println("Informe um Número: ");
        Integer n1 = in.nextInt();
        
        System.out.println("Informe outro Número:");
        Integer n2 = in.nextInt();
        
        Integer result = calc.exibirSoma(n1, n2);
        
        System.out.println("Informe outro Número para somar com os outros: ");
        Integer n3 = in.nextInt();
        
        System.out.println(n3 + result);
        
        if(calc.isPar(n3 + result))
            System.out.println("É par");
        else 
            System.out.println("É Impar");
                
    }
}
