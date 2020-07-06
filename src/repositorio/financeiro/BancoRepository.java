package br.com.tisyserp.repositorio.financeiro;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.financeiro.Banco;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class BancoRepository implements  PanacheRepositoryBase<Banco, Long> {

}