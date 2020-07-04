package br.com.tisyserp.repository.produto;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.produto.TabelaIbpt;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class TabelaIbptRepository implements  PanacheRepositoryBase<TabelaIbpt, Long> {

}