package br.com.tisyserp.repository.pessoa;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.pessoa.ParceiroTabelaPreco;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ParceiroTabelaPrecoRepository implements  PanacheRepositoryBase<ParceiroTabelaPreco, Long> {

}