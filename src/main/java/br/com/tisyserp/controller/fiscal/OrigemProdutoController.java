package br.com.tisyserp.controller.fiscal;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.tisyserp.model.fiscal.OrigemProduto;
import br.com.tisyserp.repository.fiscal.OrigemProdutoRepository;

@Path("/origemproduto")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OrigemProdutoController {
	
	String sql  = "";

    @Inject
	public
    OrigemProdutoRepository Repo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public OrigemProduto getUF(@PathParam("id") final Integer id) throws NoResultException {

		final OrigemProduto resp = Repo.findById(id);
		if (resp == null) {
			throw new NoResultException("OrigemProduto - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid OrigemProduto create(@Valid final OrigemProduto OrigemProduto) {
		Repo.persist(OrigemProduto);
	    return OrigemProduto;
	
    }
}
