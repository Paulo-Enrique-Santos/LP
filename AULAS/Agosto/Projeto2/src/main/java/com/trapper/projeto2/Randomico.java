
package com.trapper.projeto2;

import java.util.concurrent.ThreadLocalRandom;

public class Randomico {
    public static void main(String[] args) {
        /*
            Math.random();
        Random x = new Random();
          * x.nextInt(10);
          * x.nextBoolean();
        */
        
        Integer frase = ThreadLocalRandom.current().nextInt(0,11);
        
        System.out.println(frase);
    }
}
