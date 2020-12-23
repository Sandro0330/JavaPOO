package com.sandro.polimorfismo;

public class ClassePrincipal {
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra= new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        GoldFish goldFish = new GoldFish();
        Arara arara = new Arara();

        canguru.locomover();//Pólimorfismo
        canguru.emitirSom();//Pólimorfismo

        cachorro.locomover(); //Pólimorfismo
        cachorro.emitirSom();//Pólimorfismo

        goldFish.locomover();



    }


}
