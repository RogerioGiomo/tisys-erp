package br.com.tisyserp.repository.recursohumano;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.recursohumano.Funcao;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class FuncaoRepository implements  PanacheRepositoryBase<Funcao, Integer> {

}