package com.murilo.repository;

import com.murilo.ApplicationConfiguration;
import com.murilo.model.Cliente;
import jakarta.inject.Singleton;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Singleton
public class ClienteRepositoryImpl implements ClienteRepository {

    private final EntityManager entityManager;
    private final ApplicationConfiguration applicationConfiguration;

    //DI
    public ClienteRepositoryImpl(EntityManager entityManager, ApplicationConfiguration applicationConfiguration) {
        this.entityManager = entityManager;
        this.applicationConfiguration = applicationConfiguration;
    }
    //O USO DO ENTITY MANAGER OBRIGA UM TRANSACTION

    @Override
    public Optional<Cliente> obterPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public Cliente salvar(Cliente cliente) {
        return null;
    }

    @Override
    public void deletarPorId(Long id) {

    }

    @Override
    public List<Cliente> encontrarTodos() {
        return null;
    }

    @Override
    public int atualizar(Long id, String nome, String sobrenome, Integer idade) {
        return 0;
    }
}
