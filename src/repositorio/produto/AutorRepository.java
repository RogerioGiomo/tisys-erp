package br.com.tisyserp.repositorio.produto;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.produto.Autor;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class AutorRepository implements  PanacheRepositoryBase<Autor, Long> {

}