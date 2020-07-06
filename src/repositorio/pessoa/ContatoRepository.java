package br.com.tisyserp.repositorio.pessoa;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.pessoa.Contato;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ContatoRepository implements  PanacheRepositoryBase<Contato, Long> {

}