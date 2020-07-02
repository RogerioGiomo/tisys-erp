package br.com.tisyserp.repository.tabelaauxiliar;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.TabelaAuxiliar.Cfop;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class CfopRepository implements  PanacheRepositoryBase<Cfop, Integer> {

}