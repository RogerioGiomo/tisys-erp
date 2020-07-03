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

import br.com.tisyserp.model.pessoa.ParceiroTransportadora;
import br.com.tisyserp.repository.pessoa.ParceiroTransportadoraRepository;

@Path("/ParceiroTransportadora")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ParceiroTransportadoraController {
	
	String sql  = "";

    @Inject
	public
    ParceiroTransportadoraRepository ParceiroTransportadoraRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ParceiroTransportadora getUF(@PathParam("id") final Integer id) throws NoResultException {

		final ParceiroTransportadora resp = ParceiroTransportadoraRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("ParceiroTransportadora - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid ParceiroTransportadora create(@Valid final ParceiroTransportadora parceiroTransportadora) {
		ParceiroTransportadoraRepo.persist(parceiroTransportadora);
	    return parceiroTransportadora;
    }
}
