package com.unipim.pim_srv_fazenda_urbana_api.controllers;

import com.unipim.pim_srv_fazenda_urbana_api.dto.Login;
import com.unipim.pim_srv_fazenda_urbana_api.models.Cliente;
import com.unipim.pim_srv_fazenda_urbana_api.services.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping(path = "/login")
    public ResponseEntity<Cliente> login(@Valid @RequestBody Login login) throws Exception {
        Cliente cliente = new Cliente();
        cliente = service.buscaClientePorEmailESenha(login);

        return ResponseEntity.ok().body(cliente);
    }
}
