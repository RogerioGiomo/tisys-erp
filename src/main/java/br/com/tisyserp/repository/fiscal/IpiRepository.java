package br.com.tisyserp.repository.fiscal;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.fiscal.Ipi;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class IpiRepository implements  PanacheRepositoryBase<Ipi, Integer> {
    
}
