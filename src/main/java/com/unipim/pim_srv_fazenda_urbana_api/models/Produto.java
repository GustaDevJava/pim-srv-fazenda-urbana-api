package com.unipim.pim_srv_fazenda_urbana_api.models;

import jakarta.persistence.*; // Use `javax.persistence` se estiver usando uma versão mais antiga do Spring
import java.io.Serializable;

@Entity
@Table(name = "Produto", schema = "dbo") // Mapeia para a tabela "dbo.Produto" no banco de dados
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define que o ID será gerado automaticamente
    @Column(name = "id") // Mapeia para a coluna "id"
    private int id;

    @Column(name = "nome", nullable = false, length = 100) // Define a coluna "nome"
    private String nome;

    @Column(name = "preco", nullable = false) // Define a coluna "preco"
    private double preco;

    @Column(name = "categoria", length = 50) // Define a coluna "categoria"
    private String categoria;

    @Column(name = "desconto") // Define a coluna "desconto"
    private double desconto;

    @Column(name = "imagem", length = 255) // Define a coluna "image"
    private String image;

    @Column(name = "quantidade", nullable = false) // Define a coluna "quantidade"
    private int quantidade;

    // Construtor padrão
    public Produto() {}

    // Construtor com parâmetros
    public Produto(int id, String nome, double preco, String categoria, double desconto, String image, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.desconto = desconto;
        this.image = image;
        this.quantidade = quantidade;
    }

    // Getters e Setters
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
