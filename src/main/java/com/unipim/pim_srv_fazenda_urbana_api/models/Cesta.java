package com.unipim.pim_srv_fazenda_urbana_api.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cesta implements Serializable {

    private Integer id;
    private List<Produto> produtos = new ArrayList<>();

    public Cesta(){}

    public Cesta(Integer id, List<Produto> produtos) {
        this.id = id;
        this.produtos = produtos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
