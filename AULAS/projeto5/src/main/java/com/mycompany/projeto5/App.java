package com.mycompany.projeto5;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("0001", "Paulo Enrique", "ADS", 10.0, 10.0);
        
        System.out.println("Média: " + aluno1.getMedia());
    }
}
