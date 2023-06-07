package br.com.loja.senai.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "quantidade")
    private int quantidade;
    @Column(name = "preco_unitario")
    private double preco_unitario;
    
  

}
