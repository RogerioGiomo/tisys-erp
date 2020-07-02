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

import br.com.tisyserp.model.produto.ProdutoFamilia;
import br.com.tisyserp.repository.produto.ProdutoFamiliaRepository;

@Path("/ProdutoFamilia")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoFamiliaController {
	
	String sql  = "";

    @Inject
	public
    ProdutoFamiliaRepository ProdutoFamiliaRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ProdutoFamilia getUF(@PathParam("id") final Integer id) throws NoResultException {

		final ProdutoFamilia resp = ProdutoFamiliaRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("ProdutoFamilia - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid ProdutoFamilia create(@Valid final ProdutoFamilia ProdutoFamilia) {
		ProdutoFamiliaRepo.persist(ProdutoFamilia);
	    return ProdutoFamilia;
    }
}