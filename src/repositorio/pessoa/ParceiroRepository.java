package br.com.tisyserp.repositorio.pessoa;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.pessoa.Parceiro;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ParceiroRepository implements  PanacheRepositoryBase<Parceiro, Long> {

}