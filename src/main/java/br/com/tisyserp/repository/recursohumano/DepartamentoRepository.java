package br.com.tisyserp.repository.recursohumano;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.recursohumano.Departamento;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class DepartamentoRepository implements  PanacheRepositoryBase<Departamento, Long> {

}