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

import br.com.tisyserp.model.recursohumano.Gerente;
import br.com.tisyserp.repository.recursohumano.GerenteRepository;

@Path("/Gerente")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GerenteController {
	
	String sql  = "";

    @Inject
	public
    GerenteRepository GerenteRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Gerente getUF(@PathParam("id") final Integer id) throws NoResultException {

		final Gerente resp = GerenteRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Gerente - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid Gerente create(@Valid final Gerente gerente) {
		GerenteRepo.persist(gerente);
	    return gerente;
    }
}
