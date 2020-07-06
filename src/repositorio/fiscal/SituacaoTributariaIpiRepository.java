package br.com.tisyserp.repositorio.fiscal;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.fiscal.SituacaoTributariaIpi;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class SituacaoTributariaIpiRepository implements  PanacheRepositoryBase<SituacaoTributariaIpi, Long> {
    
}
