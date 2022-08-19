
package com.trapper.lista2_01221076_pauloenrique;

import java.util.Scanner;


public class Votacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Integer votoCalabresa = 0;
        Integer votoMussarela = 0;
        Integer votoQuatroQueijos = 0;
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Vote no sabor preferido de pizza");
            Integer voto = leitor.nextInt();
            
            if(voto == 25){
                votoCalabresa++;
            } else if (voto == 5){
                votoMussarela++;
            } else if (voto == 50){
                votoQuatroQueijos++;
            }
        }
        
        String frase;
        
        if (votoCalabresa > votoMussarela && votoCalabresa >votoQuatroQueijos){
            frase = "Calabresa";
        } else if (votoMussarela > votoCalabresa && votoMussarela >votoQuatroQueijos){
            frase = "Mussarela";
        } else {
            frase = "Quatro Queijos";
        }
        
        System.out.println("Mussarela " + votoMussarela );
        System.out.println("Calabresa " + votoCalabresa );
        System.out.println("Quatro Queijos " + votoQuatroQueijos );
        System.out.println(frase);
    }
}
