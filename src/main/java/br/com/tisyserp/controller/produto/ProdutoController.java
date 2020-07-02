package br.com.tisyserp.controller.produto;

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

import br.com.tisyserp.model.produto.Produto;
import br.com.tisyserp.repository.produto.ProdutoRepository;

@Path("/Produto")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoController {
	
	String sql  = "";

    @Inject
	public
    ProdutoRepository ProdutoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Produto getUF(@PathParam("id") final Integer id) throws NoResultException {

		final Produto resp = ProdutoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Produto - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid Produto create(@Valid final Produto Produto) {
		ProdutoRepo.persist(Produto);
	    return Produto;
    }
}
