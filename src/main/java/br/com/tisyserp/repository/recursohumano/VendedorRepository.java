package br.com.tisyserp.repository.recursohumano;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.recursohumano.Vendedor;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class VendedorRepository implements  PanacheRepositoryBase<Vendedor, Integer> {

}