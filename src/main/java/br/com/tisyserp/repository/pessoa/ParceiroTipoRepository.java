package br.com.tisyserp.repository.pessoa;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.pessoa.ParceiroTipo;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ParceiroTipoRepository implements  PanacheRepositoryBase<ParceiroTipo, Integer> {

}