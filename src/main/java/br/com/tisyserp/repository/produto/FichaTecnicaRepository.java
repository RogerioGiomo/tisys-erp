package br.com.tisyserp.repository.produto;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.produto.FichaTecnica;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class FichaTecnicaRepository implements  PanacheRepositoryBase<FichaTecnica, Integer> {

}