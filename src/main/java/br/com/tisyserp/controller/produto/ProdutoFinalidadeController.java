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

import br.com.tisyserp.model.produto.ProdutoFinalidade;
import br.com.tisyserp.repository.produto.ProdutoFinalidadeRepository;

@Path("/ProdutoFinalidade")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoFinalidadeController {
	
	String sql  = "";

    @Inject
	public
    ProdutoFinalidadeRepository ProdutoFinalidadeRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ProdutoFinalidade getUF(@PathParam("id") final Integer id) throws NoResultException {

		final ProdutoFinalidade resp = ProdutoFinalidadeRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("ProdutoFinalidade - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid ProdutoFinalidade create(@Valid final ProdutoFinalidade ProdutoFinalidade) {
		ProdutoFinalidadeRepo.persist(ProdutoFinalidade);
	    return ProdutoFinalidade;
    }
}