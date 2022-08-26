
package Exercicio2;


public class ClassesSociais {
    Double qtdSalarios(Double salario){
        return salario/1045;
    }
    
    String classeSocialPertencente(Double qtdSalarios) {
        if (qtdSalarios > 20) {
            return "A";
        } else if (qtdSalarios >= 10) {
            return "B";
        } else if (qtdSalarios >= 4) {
            return  "C";
        } else if (qtdSalarios >= 2) {
            return "D";
        } else {
            return "E";
        }
    }
}
