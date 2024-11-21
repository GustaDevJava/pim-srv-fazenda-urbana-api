package com.unipim.pim_srv_fazenda_urbana_api.services;

import com.unipim.pim_srv_fazenda_urbana_api.dto.Login;
import com.unipim.pim_srv_fazenda_urbana_api.models.Cliente;
import com.unipim.pim_srv_fazenda_urbana_api.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente buscaClientePorEmailESenha(Login login) throws Exception {
        Optional<Cliente> cliente = null;
        cliente = repository.buscarPorEmailESenha(login.getEmail(), login.getSenha());

        if(cliente.get() != null){
           throw  new Exception("Erro ao acessar banco");
        }
        return cliente.get();
    }


}
