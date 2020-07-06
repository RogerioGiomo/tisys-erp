package br.com.tisyserp.repositorio.produto;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.produto.ProdutoTipo;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ProdutoTipoRepository implements  PanacheRepositoryBase<ProdutoTipo, Long> {

}