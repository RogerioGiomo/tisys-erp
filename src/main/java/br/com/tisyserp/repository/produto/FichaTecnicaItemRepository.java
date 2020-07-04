package br.com.tisyserp.repository.produto;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.produto.FichaTecnicaItem;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class FichaTecnicaItemRepository implements  PanacheRepositoryBase<FichaTecnicaItem, Long> {

}