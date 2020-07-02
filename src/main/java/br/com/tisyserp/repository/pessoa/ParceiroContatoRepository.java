package br.com.tisyserp.repository.pessoa;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.pessoa.ParceiroContato;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ParceiroContatoRepository implements  PanacheRepositoryBase<ParceiroContato, Integer> {

}