package br.com.tisyserp.repositorio.fiscal;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.fiscal.SituacaoTributariaCofins;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class SituacaoTributariaCofinsRepository implements  PanacheRepositoryBase<SituacaoTributariaCofins, Long> {
    
}
