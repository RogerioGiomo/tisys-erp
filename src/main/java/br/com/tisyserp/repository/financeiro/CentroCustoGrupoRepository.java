package br.com.tisyserp.repository.financeiro;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.financeiro.CentroCustoGrupo;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class CentroCustoGrupoRepository implements  PanacheRepositoryBase<CentroCustoGrupo, Long> {

}