package br.com.tisyserp.repository.fiscal;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.fiscal.SituacaoTributariaIpi;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class SituacaoTributariaIpiRepository implements  PanacheRepositoryBase<SituacaoTributariaIpi, Integer> {
    
}
