package br.com.tisyserp.repositorio.fiscal;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.fiscal.Ipi;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class IpiRepository implements  PanacheRepositoryBase<Ipi, Long> {
    
}
