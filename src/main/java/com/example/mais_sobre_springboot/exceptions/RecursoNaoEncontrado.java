package com.example.mais_sobre_springboot.exceptions;

public class RecursoNaoEncontrado extends RuntimeException {
    public RecursoNaoEncontrado(String mensagem)
    {
        super(mensagem);
    }
}
