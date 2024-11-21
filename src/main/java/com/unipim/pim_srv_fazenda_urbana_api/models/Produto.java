package com.unipim.pim_srv_fazenda_urbana_api.models;

public class Produto {
    public int id;
    public String nome;
    public double preco;
    public String categoria;
    public double desconto;
    public String image;
    public int quantidade;

    public Produto() {}

    public Produto(int id, String nome, double preco, String categoria, double desconto, String image, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.desconto = desconto;
        this.image = image;
        this.quantidade = quantidade;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
