package com.example.mais_sobre_springboot.service;

import com.example.mais_sobre_springboot.exceptions.RecursoNaoEncontrado;
import com.example.mais_sobre_springboot.model.Produto;
import com.example.mais_sobre_springboot.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontrado("Produto com id: "+id+" não encontrado."));
    }

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id) {

        if(!produtoRepository.existsById(id)) {
            throw  new RecursoNaoEncontrado("Produto com ID "+id+ " não encontrado.");
        }

        produtoRepository.deleteById(id);
    }

}
