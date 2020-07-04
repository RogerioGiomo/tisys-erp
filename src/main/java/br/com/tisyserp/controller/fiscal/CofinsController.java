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

import br.com.tisyserp.model.fiscal.Cofins;
import br.com.tisyserp.repository.fiscal.CofinsRepository;

@Path("/cofins")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CofinsController {
	
	String sql  = "";

    @Inject
	public
    CofinsRepository CofinsRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Cofins getId(@PathParam("id") final Long id) throws NoResultException {

		final Cofins resp = CofinsRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Cofins - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid Cofins create(@Valid final Cofins cofins) {
		CofinsRepo.persist(cofins);
	    return cofins;

    }
}
