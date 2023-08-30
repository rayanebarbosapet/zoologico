package com.zoologico.programa;


public class Setor extends Zoologico{
    private int id;
    private String nome;

    public Setor(int id, String nome, String endereco) {
        super(id, nome, endereco);
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
