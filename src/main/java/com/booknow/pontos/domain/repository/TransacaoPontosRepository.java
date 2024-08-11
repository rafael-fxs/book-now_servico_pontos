package com.booknow.pontos.domain.repository;

import com.booknow.pontos.domain.model.TransacaoPontos;
import com.booknow.pontos.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransacaoPontosRepository extends JpaRepository<TransacaoPontos, Long> {
    List<TransacaoPontos> findByUsuario(Usuario usuario);
}