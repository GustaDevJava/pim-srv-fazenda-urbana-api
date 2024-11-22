package com.unipim.pim_srv_fazenda_urbana_api.services;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.unipim.pim_srv_fazenda_urbana_api.models.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unipim.pim_srv_fazenda_urbana_api.dtos.Login;
import com.unipim.pim_srv_fazenda_urbana_api.models.Cliente;

@Service
public class ClienteService {
     private List<Cliente> clientes = popularListaClientes();

//     @Autowired
//     private ProdutoService produtoService;
//    @Autowired
//    private ClienteRepository repository;

//    @Autowired
//    private ClienteRepositoryMock mock;



//    public Cliente buscaClientePorEmailESenha(Login login) throws Exception {
//        Optional<Cliente> cliente = null;
//        cliente = repository.buscarPorEmailESenha(login.getEmail(), login.getSenha());
//
//        if(cliente.get() == null){
//           throw  new Exception("Erro ao acessar banco");
//        }
//        return cliente.get();
//    }

    public Cliente buscaClientePorEmailESenhaMock(Login login) throws Exception {
        Cliente cliente = null;
        cliente = buscarClienteEmailESenha(login.getEmail(), login.getSenha());

        if(cliente == null){
           throw  new Exception("Erro ao acessar banco");
        }
        return cliente;
    }



    public Cliente buscarClienteEmailESenha(String email, String senha) throws Exception {
        Cliente cliente = null;
        for(Cliente c : clientes){
            if(email.equals(c.getEmail()) && senha.equals(c.getSenha())){
                cliente = c;
            }
        }
        if(cliente == null){
            throw new Exception("Erro ao achar cliente");
        }

        return cliente;
    }

    public void cadastrarCliente(Cliente cliente) throws Exception {
        int indice = clientes.size();
        cliente.setId(indice+1);
        clientes.add(cliente);
        int comparacao = clientes.size();

        if(indice == comparacao){
            throw new Exception("Não alterou");
        }
    }

    public List<Cliente> popularListaClientes(){
        List<Cliente> clientesL = new ArrayList<>();
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Gustavo");
        cliente.setCpf("48999625842");
        cliente.setDataNascimento(Date.from(Instant.now()));
        cliente.setCelular("11977537216");
        cliente.setEmail("guganfer@gmail.com");
        cliente.setSenha("gu41844344");
        cliente.setPremium(Boolean.FALSE);
        cliente.setImagem("C:\\Desenvolvimento P\\Infográfico Semente Verde 2.jpeg");

        Cliente cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setNome("Camila");
        cliente2.setCpf("11122233344");
        cliente2.setDataNascimento(Date.from(Instant.now()));
        cliente2.setCelular("11948262858");
        cliente2.setEmail("camila@gmail.com");
        cliente2.setSenha("camila123");
        cliente2.setPremium(Boolean.FALSE);
        cliente2.setImagem("C:\\Desenvolvimento P\\Infográfico Semente Verde 2.jpeg");

        Cliente cliente3 = new Cliente();
        cliente3.setId(3);
        cliente3.setNome("Rayan");
        cliente3.setCpf("22233344455");
        cliente3.setDataNascimento(Date.from(Instant.now()));
        cliente3.setCelular("11920209195");
        cliente3.setEmail("ryan@gmail.com");
        cliente3.setSenha("rayan123");
        cliente3.setPremium(Boolean.FALSE);
        cliente3.setImagem("C:\\Desenvolvimento P\\Infográfico Semente Verde 2.jpeg");

        Cliente cliente4 = new Cliente();
        cliente4.setId(4);
        cliente4.setNome("Giovanne");
        cliente4.setCpf("33344455566");
        cliente4.setDataNascimento(Date.from(Instant.now()));
        cliente4.setCelular("11970706164");
        cliente4.setEmail("giovanne@gmail.com");
        cliente4.setSenha("gio123");
        cliente4.setPremium(Boolean.FALSE);
        cliente4.setImagem("C:\\Desenvolvimento P\\Infográfico Semente Verde 2.jpeg");

        Collections.addAll(clientesL, cliente, cliente2, cliente3, cliente4);

        return clientesL;
    }


    public List<Cliente> findAllClientes() {
        List<Cliente> clienteList = new ArrayList<>();
        clienteList.addAll(clientes);
        return  clienteList;
    }

//    public Produto testeAdd(Produto produto) throws Exception {
//        produtoService.addProduto(produto);
//        return produto;
//    }
}
