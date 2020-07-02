package br.com.tisyserp.repository.pessoa;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.pessoa.ParceiroObraResponsavel;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ParceiroObraResponsavelRepository implements  PanacheRepositoryBase<ParceiroObraResponsavel, Integer> {

}