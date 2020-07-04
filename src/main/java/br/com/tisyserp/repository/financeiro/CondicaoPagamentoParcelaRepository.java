package br.com.tisyserp.repository.financeiro;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.financeiro.CondicaoPagamentoParcela;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class CondicaoPagamentoParcelaRepository implements  PanacheRepositoryBase<CondicaoPagamentoParcela, Long> {

}