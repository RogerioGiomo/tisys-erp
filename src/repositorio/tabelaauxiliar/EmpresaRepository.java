package br.com.tisyserp.repositorio.tabelaauxiliar;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.tabelaauxiliar.Empresa;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class EmpresaRepository implements  PanacheRepositoryBase<Empresa, Long> {

}