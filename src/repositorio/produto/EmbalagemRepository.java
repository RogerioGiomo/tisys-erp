package br.com.tisyserp.repositorio.produto;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.produto.Embalagem;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class EmbalagemRepository implements  PanacheRepositoryBase<Embalagem, Long> {

}