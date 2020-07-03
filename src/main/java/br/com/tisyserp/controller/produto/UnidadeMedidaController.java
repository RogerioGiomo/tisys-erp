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

import br.com.tisyserp.model.produto.UnidadeMedida;
import br.com.tisyserp.repository.produto.UnidadeMedidaRepository;

@Path("/UnidadeMedida")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UnidadeMedidaController {
	
	String sql  = "";

    @Inject
	public
    UnidadeMedidaRepository UnidadeMedidaRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public UnidadeMedida getUF(@PathParam("id") final Integer id) throws NoResultException {

		final UnidadeMedida resp = UnidadeMedidaRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("UnidadeMedida - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid UnidadeMedida create(@Valid final UnidadeMedida UnidadeMedida) {
		UnidadeMedidaRepo.persist(UnidadeMedida);
	    return UnidadeMedida;
    }
}
