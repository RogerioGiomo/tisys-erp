package br.com.tisyserp.controller.produto;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.tisyserp.model.produto.ProdutoSpedTipo;
import br.com.tisyserp.repository.produto.ProdutoSpedTipoRepository;

@Path("/ProdutoSpedTipo")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoSpedTipoController {
	
	String sql  = "";

    @Inject
	public
    ProdutoSpedTipoRepository ProdutoSpedTipoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ProdutoSpedTipo getUF(@PathParam("id") final Integer id) throws NoResultException {

		final ProdutoSpedTipo resp = ProdutoSpedTipoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("ProdutoSpedTipo - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid ProdutoSpedTipo create(@Valid final ProdutoSpedTipo ProdutoSpedTipo) {
		ProdutoSpedTipoRepo.persist(ProdutoSpedTipo);
	    return ProdutoSpedTipo;
    }
}
