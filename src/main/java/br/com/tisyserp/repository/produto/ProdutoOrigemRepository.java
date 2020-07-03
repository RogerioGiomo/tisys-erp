package br.com.tisyserp.repository.produto;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.produto.ProdutoOrigem;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ProdutoOrigemRepository implements  PanacheRepositoryBase<ProdutoOrigem, Integer> {

}