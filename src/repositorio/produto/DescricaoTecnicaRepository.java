package br.com.tisyserp.repositorio.produto;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.produto.DescricaoTecnica;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class DescricaoTecnicaRepository implements  PanacheRepositoryBase<DescricaoTecnica, Long> {

}