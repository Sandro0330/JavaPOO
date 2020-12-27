package com.sandro.polimorfismo_sobreposicao;
//POLIMORFISMO DE SOBREPOSIÇÃO
public abstract class Animal {
    //Atributos de Animal
    private float peso;
    private int idade;
    private int membros;

    //Métodos especiais abstractos, somente as Classes filhas podem desenvolver esses métodos
    public  abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirSom();


    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
