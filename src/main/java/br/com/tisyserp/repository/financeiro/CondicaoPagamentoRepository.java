package br.com.tisyserp.repository.financeiro;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.financeiro.CondicaoPagamento;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class CondicaoPagamentoRepository implements  PanacheRepositoryBase<CondicaoPagamento, Integer> {

}