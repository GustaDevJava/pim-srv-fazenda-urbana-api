package com.unipim.pim_srv_fazenda_urbana_api.repositories;

import com.unipim.pim_srv_fazenda_urbana_api.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {


}
