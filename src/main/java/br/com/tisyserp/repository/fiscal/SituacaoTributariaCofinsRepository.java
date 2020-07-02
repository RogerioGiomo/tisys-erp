package br.com.tisyserp.repository.fiscal;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.fiscal.SituacaoTributariaCofins;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class SituacaoTributariaCofinsRepository implements  PanacheRepositoryBase<SituacaoTributariaCofins, Integer> {
    
}
