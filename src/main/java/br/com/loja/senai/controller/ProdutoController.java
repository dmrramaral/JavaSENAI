package br.com.loja.senai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.loja.senai.entity.Produto;
import br.com.loja.senai.repository.ProdutoRepository;

@RestController
@RequestMapping("api/produto")
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(value = "/listar",method = RequestMethod.GET)
    public List<Produto> listar(){
        return produtoRepository.findAll();
    }

    @RequestMapping(value = "/cadastrar",method = RequestMethod.POST)
    public void cadastrar(Produto produto){
        produtoRepository.save(produto);
    }

    @RequestMapping(value = "/alterar",method = RequestMethod.PUT)
    public void alterar(Produto produto){
        produtoRepository.save(produto);
    }

    @RequestMapping(value = "/deletar/{id}",method = RequestMethod.DELETE)
    public void deletar(int id){
        produtoRepository.deleteById(id);
    }


  


}
