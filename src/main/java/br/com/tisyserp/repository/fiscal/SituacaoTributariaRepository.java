package br.com.tisyserp.repository.fiscal;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.fiscal.SituacaoTributaria;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class SituacaoTributariaRepository implements  PanacheRepositoryBase<SituacaoTributaria, Integer> {
    
}
