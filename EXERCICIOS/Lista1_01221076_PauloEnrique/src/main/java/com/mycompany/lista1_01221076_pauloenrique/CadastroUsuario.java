package com.mycompany.lista1_01221076_pauloenrique;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner texto = new Scanner (System.in);
        Scanner numero = new Scanner (System.in);
        
        System.out.println("Informe seu login:");
        String login = texto.nextLine();
        
        System.out.println("Informe sua senha:");
        Integer senha = numero.nextInt();
        
        System.out.println("Informe quantas tentativas você aceita:");
        Integer tentativas = numero.nextInt();
        
        String frase = String.format("Seu login é %s e sua senha é %d. Você tem %d tentativas antes de ser bloqueado", login, senha,tentativas);
        
        System.out.println(frase);
        
    }
}
