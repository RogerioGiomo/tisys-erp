package br.com.tisyserp.repositorio.pessoa;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.pessoa.ParceiroTipoEndereco;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ParceiroTipoEnderecoRepository implements  PanacheRepositoryBase<ParceiroTipoEndereco, Long> {

}