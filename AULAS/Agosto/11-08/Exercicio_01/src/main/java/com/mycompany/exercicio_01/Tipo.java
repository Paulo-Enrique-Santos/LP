
package com.mycompany.exercicio_01;

public class Tipo {

    public static void main(String[] args) {
        
        /*
            String -> para texto;
            Integer -> para números inteiros
            Double -> para números com casas decimais
            Boolean -> para verdadeiro ou false;
            Qual a diferênça de int pra integer - o integer é um pouvo mais rápido que o int
        */
        
        String nome = "Paulo";
        Integer idade = 23;
        Double altura = 1.79;
        Boolean isAluno = true;
        
        System.out.print("\tOlá, sou o " + nome + " tenho " + idade + " anos, e tenho " + altura + " de altura. \n");
        System.out.println("Olá, sou o " + nome + " tenho " + idade + " anos, e tenho " + altura + " de altura.");
    }
}
