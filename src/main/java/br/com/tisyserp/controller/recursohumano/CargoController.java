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

import br.com.tisyserp.model.recursohumano.Cargo;
import br.com.tisyserp.repository.recursohumano.CargoRepository;

@Path("/cargo")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CargoController {
	
	String sql  = "";

    @Inject
	public
    CargoRepository CargoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Cargo getId(@PathParam("id") final Long id) throws NoResultException {

		final Cargo resp = CargoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Cargo - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid Cargo create(@Valid final Cargo cargo) {
		CargoRepo.persist(cargo);
	    return cargo;
    }
}
