package br.com.tisyserp.repositorio.fiscal;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.fiscal.Icm;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class IcmRepository implements  PanacheRepositoryBase<Icm, Long> {
    
}
