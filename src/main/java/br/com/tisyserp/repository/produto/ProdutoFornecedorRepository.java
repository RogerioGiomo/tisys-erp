package br.com.tisyserp.repository.produto;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.produto.ProdutoFornecedor;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ProdutoFornecedorRepository implements  PanacheRepositoryBase<ProdutoFornecedor, Integer> {

}