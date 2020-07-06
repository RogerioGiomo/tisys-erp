package br.com.tisyserp.repositorio.tabelaauxiliar;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.tabelaauxiliar.Status;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class StatusRepository implements  PanacheRepositoryBase<Status, Long> {

}