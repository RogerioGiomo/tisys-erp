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
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.faulttolerance.Retry;

import br.com.tisyserp.model.fiscal.Icm;

@Path("/icm")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class IcmController {
	
	String sql  = "";


    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}") @Retry(maxRetries = 4)
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response getId(@PathParam("id")  Long id) throws NoResultException {

		 Icm resp = Icm.findById(id);
		if (resp == null) {
			throw new NoResultException("Icm - não encontrado - id: " + id);
		}
		return Response.ok(resp).build();
	}

	@POST  @Transactional 
 	@Retry(maxRetries = 4)
    public @Valid Icm create(@Valid  Icm icm) {
		Icm.persist(icm);
	    return icm;
	
    }
}
