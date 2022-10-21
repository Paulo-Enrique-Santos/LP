package com.mycompany.mavenproject1;

public class App {
    public static void main(String[] args) {
        Pet pet1 = new Pet("João", "Cachorro");
        Pet pet2 = new Pet("Jonas", "Gato");
        Pet pet3 = new Pet("José", "Cobra");
        
        PetShop petShop = new PetShop("Petzinho");
        
        petShop.darBanho(pet3, 100.0);
        petShop.darBanho(pet2, 150.0);
        petShop.darBanho(pet1, 150.0 , 50.0);
        
        System.out.println(petShop.toString());
        System.out.println("-".repeat(30));
        
        System.out.println(pet3.toString());
        System.out.println("-".repeat(30));
        
        petShop.darBanho(pet3, 200.0);
        
        System.out.println(petShop.toString());
        System.out.println("-".repeat(30));
        
        System.out.println(pet3.toString());
        System.out.println("-".repeat(30));
    }
}
