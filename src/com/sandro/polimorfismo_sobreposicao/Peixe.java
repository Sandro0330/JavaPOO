package com.sandro.polimorfismo_sobreposicao;

public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");

    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não tem som");
    }

    public void soltarBolhas() {
        System.out.println("Soltando bolhas");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
