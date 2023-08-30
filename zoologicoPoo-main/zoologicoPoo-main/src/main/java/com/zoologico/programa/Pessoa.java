package com.zoologico.programa;

import enums.TipodeIngresso;

public class Pessoa {
    private String nome;
    private String endereco;
    private int cep;
    private String cpf;
    private String logradouro;
    
    public Pessoa(String nome, float valorPago, TipodeIngresso quantIngresso, String logradouro, String endereco, String cpf, int cep) {
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.logradouro = logradouro;
        this.cpf=cpf;
    }

    public Pessoa(float valorPago, TipodeIngresso quantIngresso, int cpf2, int id) {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
}
