package br.com.tisyserp.repository.financeiro;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.financeiro.CentroCustoConta;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class CentroCustoContaRepository implements  PanacheRepositoryBase<CentroCustoConta, Long> {

}