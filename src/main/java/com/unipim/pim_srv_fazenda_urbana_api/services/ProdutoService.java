package com.unipim.pim_srv_fazenda_urbana_api.services;

import com.unipim.pim_srv_fazenda_urbana_api.models.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ProdutoService {

    List<Produto> produtos = populaProdutos();

    public List<Produto> listaProduto() throws Exception {
        List<Produto> listaProduto = new ArrayList<>();
        listaProduto.addAll(produtos);
        if(listaProduto.isEmpty()){
            throw new Exception("Erro ao acessar banco");
        }
        return listaProduto;
    }

    public void addProduto(Produto produto) throws Exception {
        int indice = produtos.size();
        produtos.add(produto);
        int comparacao = produtos.size();
        if(indice == comparacao){
            throw new Exception("Erro ao add");
        }
    }

    private List<Produto> populaProdutos() {
        List<Produto> listaProdutos = new ArrayList<>();

        Produto produto = new Produto();
        produto.setId(1);
        produto.setNome("Uva");
        produto.setPreco(8.5);
        produto.setCategoria("Fruta");
        produto.setDesconto(0);
        produto.setImage("C:\\Desenvolvimento P\\Infográfico Semente Verde 2.jpeg");
        produto.setQuantidade(70);

        Produto produto2 = new Produto();
        produto2.setId(2);
        produto2.setNome("Cenoura");
        produto2.setPreco(2.4);
        produto2.setCategoria("Legume");
        produto2.setDesconto(0);
        produto2.setImage("C:\\Desenvolvimento P\\Infográfico Semente Verde 2.jpeg");
        produto2.setQuantidade(50);

        Produto produto3 = new Produto();
        produto3.setId(3);
        produto3.setNome("Brocolis");
        produto3.setPreco(5.0);
        produto3.setCategoria("Vegetal");
        produto3.setDesconto(0);
        produto3.setImage("C:\\Desenvolvimento P\\Infográfico Semente Verde 2.jpeg");
        produto3.setQuantidade(40);

        Produto produto4 = new Produto();
        produto4.setId(4);
        produto4.setNome("Banana");
        produto4.setPreco(3.5);
        produto4.setCategoria("Fruta");
        produto4.setDesconto(0);
        produto4.setImage("C:\\Desenvolvimento P\\Infográfico Semente Verde 2.jpeg");
        produto4.setQuantidade(80);

        Collections.addAll(listaProdutos, produto, produto2, produto3, produto4);

        return  listaProdutos;
    }
}
