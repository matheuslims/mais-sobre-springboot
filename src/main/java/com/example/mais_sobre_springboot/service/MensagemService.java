package com.example.mais_sobre_springboot.service;

import com.example.mais_sobre_springboot.repository.MensagemRepository;
import org.springframework.stereotype.Service;

@Service
public class MensagemService {

    // instanciar apartir do construtor
    private final MensagemRepository mensagemRepository;

    public MensagemService(MensagemRepository mensagemRepository) {
        this.mensagemRepository = mensagemRepository;
    }

    public String obterMensagem() {
        return mensagemRepository.obterMensagem();
    }

}
