package com.zoologico.programa;
import enums.TipodeIngresso;

public class Funcionario  extends Pessoa {// declaração de variáveis
    private int id;
    private String cargo;

    public Funcionario(int id,String nome, float valorPago,TipodeIngresso quantIngresso, String cpf, String cargo) {// método construtor
        super(nome, valorPago , quantIngresso, cpf, cargo, cargo, id);
        this.id = id;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
