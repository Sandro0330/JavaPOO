package com.sandro.heranca_parte2;

public class Bolsista extends Aluno {
    private float bolsa;

    public void RenovarBolsa() {
        System.out.println("Renovando bolsa " + this.getNome());
    }


    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
