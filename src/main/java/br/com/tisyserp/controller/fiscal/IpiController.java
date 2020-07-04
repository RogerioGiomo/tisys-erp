package br.com.tisyserp.controller.fiscal;

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

import br.com.tisyserp.model.fiscal.Ipi;
import br.com.tisyserp.repository.fiscal.IpiRepository;

@Path("/ipi")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class IpiController {
	
	String sql  = "";

    @Inject
	public
    IpiRepository Repo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Ipi getId(@PathParam("id") final Long id) throws NoResultException {

		final Ipi resp = Repo.findById(id);
		if (resp == null) {
			throw new NoResultException("ipi - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid Ipi create(@Valid final Ipi ipi) {
		Repo.persist(ipi);
	    return ipi;

    }
}
