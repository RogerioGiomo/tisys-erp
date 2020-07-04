package br.com.tisyserp.repository.recursohumano;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.recursohumano.Motorista;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class MotoristaRepository implements  PanacheRepositoryBase<Motorista, Long> {

}