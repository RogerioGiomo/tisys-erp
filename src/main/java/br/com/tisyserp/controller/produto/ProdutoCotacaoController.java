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

import br.com.tisyserp.model.produto.ProdutoCotacao;
import br.com.tisyserp.repository.produto.ProdutoCotacaoRepository;

@Path("/ProdutoCotacao")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoCotacaoController {
	
	String sql  = "";

    @Inject
	public
    ProdutoCotacaoRepository ProdutoCotacaoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ProdutoCotacao getId(@PathParam("id") final Long id) throws NoResultException {

		final ProdutoCotacao resp = ProdutoCotacaoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("ProdutoCotacao - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid ProdutoCotacao create(@Valid final ProdutoCotacao produtoCotacao) {
		ProdutoCotacaoRepo.persist(produtoCotacao);
	    return produtoCotacao;
    }
}
