package com.zoologico.programa;

import enums.TipodeIngresso;

public class Cliente extends Pessoa {
    private int id;
    private float valorPago;
    private TipodeIngresso quantIngresso;

public Cliente(int id,float valorPago,TipodeIngresso quantIngresso, int cpf){
    super(valorPago , quantIngresso, cpf, id);
    this.id = id;
    this.valorPago = valorPago;
    this.quantIngresso = quantIngresso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public TipodeIngresso getQuantIngresso() {
        return quantIngresso;
    }

    public void setQuantIngresso(TipodeIngresso quantIngresso) {
        this.quantIngresso = quantIngresso;
    }

}
