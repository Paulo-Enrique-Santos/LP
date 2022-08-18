package com.mycompany.lista1_01221076_pauloenrique;

import java.util.Scanner;


public class Calorias {
    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);
        
        System.out.println("Informe Quanto minutos você se aqueceu");
        Integer aquecimento = numero.nextInt();
        
        System.out.println("Informe Quanto minutos você fez aeróbicos");
        Integer aerobicos = numero.nextInt();
        
        System.out.println("Informe Quanto minutos você fez musculação");
        Integer musculacao = numero.nextInt();        
        
        Integer caloriasTotal = (aquecimento * 12) + (aerobicos * 20) + (musculacao * 25);
        
        Integer minutosTotal = aquecimento + aerobicos + musculacao;
        
        String frase = String.format("Olá, Jorge. Você fez um total de %s minutos de exercícios e perdeu cerca de %s calorias", minutosTotal, caloriasTotal);
        
        System.out.println(frase);
        
    }
}
