package br.com.tisyserp.repositorio.fiscal;
import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.fiscal.SerieFiscal;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class SerieFiscalRepository implements  PanacheRepositoryBase<SerieFiscal, Long> {
    
}
