package com.unipim.pim_srv_fazenda_urbana_api.controllers;

import com.unipim.pim_srv_fazenda_urbana_api.models.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.unipim.pim_srv_fazenda_urbana_api.dtos.Login;
import com.unipim.pim_srv_fazenda_urbana_api.models.Cliente;
import com.unipim.pim_srv_fazenda_urbana_api.services.ClienteService;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ClienteController {

    @Autowired
    private ClienteService service;

//    @PostMapping(path = "/login")
//    public ResponseEntity<Cliente> login(@Valid @RequestBody Login login) throws Exception {
//        Cliente cliente = new Cliente();
//        cliente = service.buscaClientePorEmailESenha(login);
//
//        return ResponseEntity.ok().body(cliente);
//    }

    @PostMapping(path = "/loginMock")
    public ResponseEntity<Cliente> loginMock(@RequestBody Login login) throws Exception {
        Cliente cliente = service.buscaClientePorEmailESenhaMock(login);

        return ResponseEntity.ok().body(cliente);
    }

    @PostMapping(path = "/cadastra-cliente")
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente cliente) throws Exception {
        service.cadastrarCliente(cliente);
        return ResponseEntity.ok().body(cliente);
    }

    @PostMapping(path = "/cadastra-cliente")
    public ResponseEntity<Produto> testeProd(@RequestBody Produto cliente) throws Exception {
        service.testeAdd(cliente);
        return ResponseEntity.ok().body(cliente);
    }

    @GetMapping("/clientes")
    public ResponseEntity<List<Cliente>> findAllClientes(){
        List<Cliente> clientes = service.findAllClientes();
        return ResponseEntity.ok().body(clientes);
    }
    
}
