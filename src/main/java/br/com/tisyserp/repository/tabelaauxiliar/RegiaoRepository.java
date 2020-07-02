package br.com.tisyserp.repository.tabelaauxiliar;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.TabelaAuxiliar.Regiao;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class RegiaoRepository implements  PanacheRepositoryBase<Regiao, Integer> {

}