package br.com.tisyserp.repositorio.financeiro;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.financeiro.SituacaoFinanceira;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class SituacaoFinanceiraRepository implements  PanacheRepositoryBase<SituacaoFinanceira, Long> {

}