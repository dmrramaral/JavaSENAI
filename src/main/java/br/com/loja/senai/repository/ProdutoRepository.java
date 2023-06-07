package br.com.loja.senai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.loja.senai.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

    


}
