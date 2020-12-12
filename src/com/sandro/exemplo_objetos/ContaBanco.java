package com.sandro.exemplo_objetos;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //Métodos epeciais
    public ContaBanco() { //Método Construtor
        this.saldo = 0;
        this.status = false;
    }

    public void estadoAtual() {
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Métodos Personalizados
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true); // usando método modificador
        //this.status = true; acessando diretamente o atributo
        if(t == "CC"){
            this.saldo = 50;
        } else if (t == "CP"){
            this.saldo = 150;
        }
        System.out.println("Conta aberta com sucesso!!");
    }

    public void fecharConta() {
        if(saldo > 0) {
            System.out.println("Conta não pode ser fecha ainda possui saldo disponivel!");
        } else if (saldo < 0) {
            System.out.println("Conta não pode ser fecha ainda possui débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta pode ser fechada com sucesso!");
        }
    }

    public void depositar(double v) {
        if(this.getStatus()) {
           // this.saldo = this.saldo + v; mesma finalidade com o código abaixo
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada!");
        }
        System.out.println("Valor do deposito R$" + v);
    }

    public void sacar(double v) {
        if(this.getStatus()) {
             if(this.getSaldo() >= v) {
                 this.setSaldo(this.getSaldo() - v);
                 System.out.println("Saque realizado na conta de " + this.getDono());
             } else {
                 System.out.println("Saldo insuficiente para saque");
             }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
        System.out.println("Valor do saque R$" + v  );
    }

    public void pagarMensal() {
         int v = 0;
         if(this.getTipo() ==  "CC") {
             v = 12;
         } else if(getTipo() == "CP") {
             v = 20;
         } if(getStatus()) {
             this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + getDono());
        } else {
            System.out.println("Conta inativa não pode receber mensalidade!");
        }
    }


}
