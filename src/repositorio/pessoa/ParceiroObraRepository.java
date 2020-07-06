package br.com.tisyserp.repositorio.pessoa;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.pessoa.ParceiroObra;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ParceiroObraRepository implements  PanacheRepositoryBase<ParceiroObra, Long> {

}