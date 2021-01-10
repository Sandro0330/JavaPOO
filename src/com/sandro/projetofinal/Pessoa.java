package com.sandro.projetofinal;

public class Pessoa {
    protected String nomeUsuario;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    public Pessoa(String nomeUsuario, int idade, String sexo) {
        this.nomeUsuario = nomeUsuario;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nomeUsuario = '" + nomeUsuario + '\'' +
                ", idade = " + idade +
                ", sexo = '" + sexo + '\'' +
                ", experiencia = " + experiencia +
                '}';
    }
}
