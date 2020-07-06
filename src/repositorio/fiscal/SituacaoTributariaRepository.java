package br.com.tisyserp.repositorio.fiscal;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.fiscal.SituacaoTributaria;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class SituacaoTributariaRepository implements  PanacheRepositoryBase<SituacaoTributaria, Long> {
    
}
