package br.com.tisyserp.repositorio.tabelaauxiliar;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.tabelaauxiliar.TabelaPreco;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class TabelaPrecoRepository implements  PanacheRepositoryBase<TabelaPreco, Long> {

}