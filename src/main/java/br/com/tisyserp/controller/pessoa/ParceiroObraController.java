package br.com.tisyserp.controller.pessoa;

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

import br.com.tisyserp.model.pessoa.ParceiroObra;
import br.com.tisyserp.repository.pessoa.ParceiroObraRepository;

@Path("/ParceiroObra")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ParceiroObraController {
	
	String sql  = "";

    @Inject
	public
    ParceiroObraRepository ParceiroObraRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ParceiroObra getUF(@PathParam("id") final Integer id) throws NoResultException {

		final ParceiroObra resp = ParceiroObraRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("ParceiroObra - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid ParceiroObra create(@Valid final ParceiroObra ParceiroObra) {
		ParceiroObraRepo.persist(ParceiroObra);
	    return ParceiroObra;
    }
}
