package br.com.tisyserp.repositorio.tabelaauxiliar;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.tabelaauxiliar.Regiao;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class RegiaoRepository implements  PanacheRepositoryBase<Regiao, Long> {

}