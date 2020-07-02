package br.com.tisyserp.controller.tabelaauxiliar;

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

import br.com.tisyserp.model.TabelaAuxiliar.Status;
import br.com.tisyserp.repository.tabelaauxiliar.StatusRepository;

@Path("/Status")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StatusController {
	
	String sql  = "";

    @Inject
	public
    StatusRepository StatusRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Status getUF(@PathParam("id") final Integer id) throws NoResultException {

		final Status resp = StatusRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Status - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid Status create(@Valid final Status Status) {
		StatusRepo.persist(Status);
	    return Status;
    }
}
