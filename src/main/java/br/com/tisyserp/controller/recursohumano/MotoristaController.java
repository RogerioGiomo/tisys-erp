package br.com.tisyserp.controller.recursohumano;

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

import br.com.tisyserp.model.recursohumano.Motorista;
import br.com.tisyserp.repository.recursohumano.MotoristaRepository;

@Path("/Motorista")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MotoristaController {
	
	String sql  = "";

    @Inject
	public
    MotoristaRepository MotoristaRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Motorista getUF(@PathParam("id") final Integer id) throws NoResultException {

		final Motorista resp = MotoristaRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Motorista - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid Motorista create(@Valid final Motorista Motorista) {
		MotoristaRepo.persist(Motorista);
	    return Motorista;
    }
}
