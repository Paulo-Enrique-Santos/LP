package Exercicio6;

public class VerificarPrimo {
    void isPrimo(Integer numero){
        Integer contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        
        if (contador == 2) {
            System.out.println("Número é primo!");
        } else {
            System.out.println("Número não é primo!");
        }
    }
}
