package br.com.tisyserp.repository.pessoa;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.pessoa.ParceiroTransportadora;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ParceiroTransportadoraRepository implements  PanacheRepositoryBase<ParceiroTransportadora, Integer> {

}