package com.unipim.pim_srv_fazenda_urbana_api.controllers;

import com.unipim.pim_srv_fazenda_urbana_api.models.Produto;
import com.unipim.pim_srv_fazenda_urbana_api.services.ProdutoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

//    @GetMapping(path = "/produtos")
//    public ResponseEntity<List<Produto>> findAllProdutos() throws Exception {
//        List<Produto> produtos = service.listaProduto();
//
//        return ResponseEntity.ok().body(produtos);
//    }

    @GetMapping(path = "/produtos")
    public ResponseEntity<List<Produto>> findAll() throws Exception {
        List<Produto> produtos = new ArrayList<>();
        produtos = service.findAll();
        return ResponseEntity.ok().body(produtos);
    }

    @GetMapping(path = "/produto/{id}")
    public ResponseEntity<Produto> findById(@PathVariable int id) throws Exception {
        Produto produto = service.findById(id);

        return ResponseEntity.ok().body(produto);
    }


}
