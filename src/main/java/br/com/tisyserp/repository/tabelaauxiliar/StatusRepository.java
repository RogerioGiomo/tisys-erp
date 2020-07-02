package br.com.tisyserp.repository.tabelaauxiliar;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.TabelaAuxiliar.Status;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class StatusRepository implements  PanacheRepositoryBase<Status, Integer> {

}