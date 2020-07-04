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

import br.com.tisyserp.model.pessoa.Rota;
import br.com.tisyserp.repository.pessoa.RotaRepository;

@Path("/Rota")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RotaController {
	
	String sql  = "";

    @Inject
	public
    RotaRepository RotaRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Rota getId(@PathParam("id") final Long id) throws NoResultException {

		final Rota resp = RotaRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Rota - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid Rota create(@Valid final Rota rota) {
		RotaRepo.persist(rota);
	    return rota;
    }
}
