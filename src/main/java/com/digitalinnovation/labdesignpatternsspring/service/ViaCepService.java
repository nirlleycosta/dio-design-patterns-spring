package com.digitalinnovation.labdesignpatternsspring.service;

import com.digitalinnovation.labdesignpatternsspring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 Client HTTP, criado via <b>OpenFeign</b>, para o consumo da API do
 <b>ViaCEP</b>.

 @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 @see <a href="https://viacep.com.br>ViaCEP</a>

 @author nirlleycosta
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
