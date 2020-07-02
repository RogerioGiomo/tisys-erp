package br.com.tisyserp.repository.recursohumano;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.recursohumano.Supervisor;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class SupervisorRepository implements  PanacheRepositoryBase<Supervisor, Integer> {

}