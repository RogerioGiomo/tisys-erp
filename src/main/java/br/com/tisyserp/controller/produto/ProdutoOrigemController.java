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

import br.com.tisyserp.model.produto.ProdutoOrigem;
import br.com.tisyserp.repository.produto.ProdutoOrigemRepository;

@Path("/produto_origem")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoOrigemController {
	
	String sql  = "";

    @Inject
	public
    ProdutoOrigemRepository ProdutoOrigemRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ProdutoOrigem getUF(@PathParam("id") final Integer id) throws NoResultException {

		final ProdutoOrigem resp = ProdutoOrigemRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("ProdutoOrigem - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid ProdutoOrigem create(@Valid final ProdutoOrigem ProdutoOrigem) {
		ProdutoOrigemRepo.persist(ProdutoOrigem);
	    return ProdutoOrigem;
    }
}