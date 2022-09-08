package com.mycompany.lista4_01221076_pauloenrique;

public class Temperatura {
    Integer temperaturaMin;
    Integer temperaturaMax;
    Integer temperaturaAtual;
    
    void aumentaTemperatura(Integer temperatura) {
        if(temperaturaAtual > temperaturaMax){
            temperaturaAtual = temperatura;
            temperaturaMax = temperaturaAtual;
        } else {
            temperaturaAtual = temperatura;
        }
    }
    void diminuiTemperatura(Integer temperatura) {
        if(temperaturaAtual < temperaturaMax){
            temperaturaAtual = temperatura;
            temperaturaMin = temperaturaAtual;
        } else {
            temperaturaAtual = temperatura;
        }
    }    
    void exibeFahreinheit() {
        System.out.println("Valor da temperatura em Fahreinheit: " + temperaturaAtual * 1.8 + 32);
    }
}
