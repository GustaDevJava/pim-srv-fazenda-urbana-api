package com.unipim.pim_srv_fazenda_urbana_api.repositories;

import com.unipim.pim_srv_fazenda_urbana_api.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Component
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query("SELECT c FROM Cliente c WHERE c.email = :email AND c.senha = :senha")
    Optional<Cliente> buscarPorEmailESenha(@Param("email") String email, @Param("senha") String senha);

}
