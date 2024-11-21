package com.unipim.pim_srv_fazenda_urbana_api.models;

import java.io.Serializable;

public class CestaProduto implements Serializable {

    private Integer idProduto;
    private  Integer idCesta;

    public CestaProduto(){}

    public CestaProduto(Integer idProduto, Integer idCesta) {
        this.idProduto = idProduto;
        this.idCesta = idCesta;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getIdCesta() {
        return idCesta;
    }

    public void setIdCesta(Integer idCesta) {
        this.idCesta = idCesta;
    }
}
