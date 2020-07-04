package br.com.tisyserp.repository.fiscal;
import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.fiscal.SerieFiscal;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class SerieFiscalRepository implements  PanacheRepositoryBase<SerieFiscal, Long> {
    
}
