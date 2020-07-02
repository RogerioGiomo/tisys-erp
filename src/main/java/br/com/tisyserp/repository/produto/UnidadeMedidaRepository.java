package br.com.tisyserp.repository.produto;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.produto.UnidadeMedida;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class UnidadeMedidaRepository implements  PanacheRepositoryBase<UnidadeMedida, Integer> {

}