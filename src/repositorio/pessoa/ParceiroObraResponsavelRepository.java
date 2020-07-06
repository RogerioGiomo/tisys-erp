package br.com.tisyserp.repositorio.pessoa;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.pessoa.ParceiroObraResponsavel;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ParceiroObraResponsavelRepository implements  PanacheRepositoryBase<ParceiroObraResponsavel, Long> {

}