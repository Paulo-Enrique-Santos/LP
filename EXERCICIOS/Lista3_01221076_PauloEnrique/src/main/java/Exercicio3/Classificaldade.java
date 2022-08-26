package Exercicio3;

public class Classificaldade {
    void classificaldade (Integer idade) {
        if (idade > 60) {
            System.out.println("Idoso");
        } else if (idade >= 31) {
            System.out.println("Adulto");
        } else if (idade >= 20) {
            System.out.println("Jovem");
        } else if (idade >= 12){
            System.out.println("Adolescente");
        } else if (idade > 3) {
            System.out.println("Criança");
        } else {
            System.out.println("Bebê");
        }
    }
}
