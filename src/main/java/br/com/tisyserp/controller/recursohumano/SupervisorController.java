package br.com.tisyserp.controller.recursohumano;

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

import br.com.tisyserp.model.recursohumano.Supervisor;
import br.com.tisyserp.repository.recursohumano.SupervisorRepository;

@Path("/Supervisor")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SupervisorController {
	
	String sql  = "";

    @Inject
	public
    SupervisorRepository SupervisorRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Supervisor getUF(@PathParam("id") final Integer id) throws NoResultException {

		final Supervisor resp = SupervisorRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Supervisor - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid Supervisor create(@Valid final Supervisor supervisor) {
		SupervisorRepo.persist(supervisor);
	    return supervisor;
    }
}
