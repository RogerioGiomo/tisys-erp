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

import br.com.tisyserp.model.produto.ProdutoGrupo;
import br.com.tisyserp.repository.produto.ProdutoGrupoRepository;

@Path("/ProdutoGrupo")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoGrupoController {
	
	String sql  = "";

    @Inject
	public
    ProdutoGrupoRepository ProdutoGrupoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ProdutoGrupo getId(@PathParam("id") final Long id) throws NoResultException {

		final ProdutoGrupo resp = ProdutoGrupoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("ProdutoGrupo - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid ProdutoGrupo create(@Valid final ProdutoGrupo produtoGrupo) {
		ProdutoGrupoRepo.persist(produtoGrupo);
	    return produtoGrupo;
    }
}
