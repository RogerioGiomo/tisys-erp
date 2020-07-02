package br.com.tisyserp.repository.tabelaauxiliar;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.TabelaAuxiliar.TabelaPreco;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class TabelaPrecoRepository implements  PanacheRepositoryBase<TabelaPreco, Integer> {

}