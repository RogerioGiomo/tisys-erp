package br.com.tisyserp.repository.tabelaauxiliar;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.TabelaAuxiliar.RamoAtividade;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class RamoAtividadeRepository implements  PanacheRepositoryBase<RamoAtividade, Integer> {

}