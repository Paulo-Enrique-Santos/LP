
package com.mycompany.exercicio_01;

public class Interpolacao {
    public static void main(String[] args) {
        
        String nome = "Paulo";
        String sobrenome = "Enrique";
        Integer idade = 23;
        Double altura = 1.79;
        
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura);
        
        // %s serve para strings
        // %d é para números inteiros 
        // %.2f é para números double e .2 é a quantidade de casas decimais que ele utilizou
        String frase = String.format("\nNome: %s\nSobrenome: %s\nIdade: %d\nAltura: %.2f\n", nome, sobrenome, idade, altura);
        
        System.out.println(frase);
    }
}
