package br.com.tisyserp.repository.pessoa;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.pessoa.Pais;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class PaisRepository implements  PanacheRepositoryBase<Pais, Integer> {

}