package com.sandro.heranca_parte2;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public void receberAumento() {
        this.salario = (salario + salario * 0.2);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
