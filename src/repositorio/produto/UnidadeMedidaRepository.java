package br.com.tisyserp.repositorio.produto;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.produto.UnidadeMedida;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class UnidadeMedidaRepository implements  PanacheRepositoryBase<UnidadeMedida, Long> {

}