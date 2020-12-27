package com.sandro.polimorfismo_sobrecarga;

public class Mamifero extends Animal {
    protected String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
}
