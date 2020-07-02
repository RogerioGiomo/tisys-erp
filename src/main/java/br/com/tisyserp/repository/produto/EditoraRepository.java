package br.com.tisyserp.repository.produto;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.produto.Editora;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class EditoraRepository implements  PanacheRepositoryBase<Editora, Integer> {

}