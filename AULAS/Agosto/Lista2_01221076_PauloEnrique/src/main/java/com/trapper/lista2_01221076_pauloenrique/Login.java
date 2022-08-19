
package com.trapper.lista2_01221076_pauloenrique;

import java.util.Scanner;


public class Login {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Informe o Login: ");
        String login = leitor.next();

        System.out.println("Informe a Senha: ");
        String senha = leitor.next();

        while (!"admin".equals(login) || !"#SPtech2022".equals(senha)) {            
            System.out.println("Login e/ou senha inválidos");
            System.out.println("Informe o Login: ");
            login = leitor.next();

            System.out.println("Informe a Senha: ");
            senha = leitor.next();
        }
        
        System.out.println("Login Realizado com Sucesso");
    }
}
