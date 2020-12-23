package com.sandro.polimorfismo;

public class Mamifero extends Animal {

    private String corpelo;

    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

    public String getCorpelo() {
        return corpelo;
    }

    public void setCorpelo(String corpele) {
        this.corpelo = corpelo;
    }

}
