
package br.com.tisyserp.repository.fiscal;

import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.fiscal.ModeloFiscal;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ModeloFiscalRepository implements  PanacheRepositoryBase<ModeloFiscal, Integer> {
    
}
