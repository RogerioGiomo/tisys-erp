package br.com.tisyserp.repositorio.recursohumano;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.recursohumano.Funcionario;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class FuncionarioRepository implements  PanacheRepositoryBase<Funcionario, Long> {

}