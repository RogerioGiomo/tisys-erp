package br.com.tisyserp.repositorio.pessoa;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.pessoa.Rota;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class RotaRepository implements  PanacheRepositoryBase<Rota, Long> {

}