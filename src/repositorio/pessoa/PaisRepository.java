package br.com.tisyserp.repositorio.pessoa;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.pessoa.Pais;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class PaisRepository implements  PanacheRepositoryBase<Pais, Long> {

}