package com.murilo.repository;

import com.murilo.model.Cliente;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface ClienteRepository {

    Optional<Cliente> obterPorId(@NotNull Long id);

    Cliente salvar(@NotBlank Cliente cliente);

    void deletarPorId(@NotNull Long id);

    List<Cliente> encontrarTodos();

    int atualizar(@NotNull Long id, @NotBlank String nome, String sobrenome, Integer idade);
}
