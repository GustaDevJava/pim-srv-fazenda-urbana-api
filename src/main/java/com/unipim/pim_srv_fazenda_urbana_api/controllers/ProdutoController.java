package com.unipim.pim_srv_fazenda_urbana_api.controllers;

import com.unipim.pim_srv_fazenda_urbana_api.models.Produto;
import com.unipim.pim_srv_fazenda_urbana_api.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping(path = "/produtos")
    public ResponseEntity<List<Produto>> findAllProdutos() throws Exception {
        List<Produto> produtos = service.listaProduto();

        return ResponseEntity.ok().body(produtos);
    }


}
