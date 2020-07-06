
package br.com.tisyserp.repositorio.fiscal;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.fiscal.ModeloFiscal;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ModeloFiscalRepository implements  PanacheRepositoryBase<ModeloFiscal, Long> {
    
}
