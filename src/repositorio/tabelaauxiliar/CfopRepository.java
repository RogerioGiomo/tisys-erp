package br.com.tisyserp.repositorio.tabelaauxiliar;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.tabelaauxiliar.Cfop;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class CfopRepository implements  PanacheRepositoryBase<Cfop, Long> {

}