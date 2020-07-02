package br.com.tisyserp.controller.fiscal;

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

import br.com.tisyserp.model.fiscal.Icm;
import br.com.tisyserp.repository.fiscal.IcmRepository;

@Path("/icm")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class IcmController {
	
	String sql  = "";

    @Inject
	public
    IcmRepository Repo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Icm getUF(@PathParam("id") final Integer id) throws NoResultException {

		final Icm resp = Repo.findById(id);
		if (resp == null) {
			throw new NoResultException("Icm - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid Icm create(@Valid final Icm icm) {
		Repo.persist(icm);
	    return icm;
	
    }
}
