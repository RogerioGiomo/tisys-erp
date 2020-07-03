package br.com.tisyserp.controller.pessoa;

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

import br.com.tisyserp.model.pessoa.ParceiroTipo;
import br.com.tisyserp.repository.pessoa.ParceiroTipoRepository;

@Path("/ParceiroTipo")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ParceiroTipoController {
	
	String sql  = "";

    @Inject
	public
    ParceiroTipoRepository ParceiroTipoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ParceiroTipo getUF(@PathParam("id") final Integer id) throws NoResultException {

		final ParceiroTipo resp = ParceiroTipoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("ParceiroTipo - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid ParceiroTipo create(@Valid final ParceiroTipo ParceiroTipo) {
		ParceiroTipoRepo.persist(ParceiroTipo);
	    return ParceiroTipo;
    }
}
