
package com.trapper.lista2_01221076_pauloenrique;


public class ContadorVariado {
    public static void main(String[] args) {
        for (double i = 0.15; i < 5; i += 0.15) {
            String numero = String.format("%.2f", i);
            
            System.out.println(numero);
        }
    }
}
