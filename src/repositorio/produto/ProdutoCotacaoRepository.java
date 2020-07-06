package br.com.tisyserp.repositorio.produto;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.produto.ProdutoCotacao;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ProdutoCotacaoRepository implements  PanacheRepositoryBase<ProdutoCotacao, Long> {

}