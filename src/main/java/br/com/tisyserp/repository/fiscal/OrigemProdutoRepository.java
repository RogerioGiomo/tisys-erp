package br.com.tisyserp.repository.fiscal;


import javax.enterprise.context.ApplicationScoped;

import br.com.tisyserp.model.fiscal.OrigemProduto;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class OrigemProdutoRepository  implements  PanacheRepositoryBase<OrigemProduto, Integer> {
    
}
