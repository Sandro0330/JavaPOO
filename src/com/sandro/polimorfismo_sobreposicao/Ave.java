package com.sandro.polimorfismo_sobreposicao;

public class Ave extends Animal{
    private String corpena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo furtas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public void fazerNinho() {
        System.out.println("Construindo o ninho");
    }

    public String getCorpena() {
        return corpena;
    }

    public void setCorpena(String corpena) {
        this.corpena = corpena;
    }
}
