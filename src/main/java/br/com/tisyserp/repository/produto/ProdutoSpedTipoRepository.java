package br.com.tisyserp.repository.produto;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.produto.ProdutoSpedTipo;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ProdutoSpedTipoRepository implements  PanacheRepositoryBase<ProdutoSpedTipo, Integer> {

}