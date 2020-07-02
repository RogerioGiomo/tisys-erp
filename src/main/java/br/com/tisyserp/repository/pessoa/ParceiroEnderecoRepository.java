package br.com.tisyserp.repository.pessoa;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.pessoa.ParceiroEndereco;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ParceiroEnderecoRepository implements  PanacheRepositoryBase<ParceiroEndereco, Integer> {

}