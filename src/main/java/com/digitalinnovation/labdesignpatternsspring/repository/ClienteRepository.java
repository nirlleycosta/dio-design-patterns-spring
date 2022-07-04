package com.digitalinnovation.labdesignpatternsspring.repository;

import com.digitalinnovation.labdesignpatternsspring.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * O que é o CrudRepository?
 * É uma interface strategy pattern, onde ela me obriga a seguir uma estratégia de implementação
 *
 * @author nirlleycosta
 * */
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
