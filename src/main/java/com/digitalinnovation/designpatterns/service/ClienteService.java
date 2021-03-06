package com.digitalinnovation.designpatterns.service;

import com.digitalinnovation.designpatterns.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente.
 * Com isso, se necessário, podemos ter múltiplas implementações dessa mesma
 * interface.
 *
 * @author nirlleycosta
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(long id, Cliente cliente);

    void deletar(Long id);
}
