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

import br.com.tisyserp.model.pessoa.ParceiroObraResponsavel;
import br.com.tisyserp.repository.pessoa.ParceiroObraResponsavelRepository;

@Path("/ParceiroObraResponsavel")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ParceiroObraResponsavelController {
	
	String sql  = "";

    @Inject
	public
    ParceiroObraResponsavelRepository ParceiroObraResponsavelRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ParceiroObraResponsavel getId(@PathParam("id") final Long id) throws NoResultException {

		final ParceiroObraResponsavel resp = ParceiroObraResponsavelRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("ParceiroObraResponsavel - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid ParceiroObraResponsavel create(@Valid final ParceiroObraResponsavel parceiroObraResponsavel) {
		ParceiroObraResponsavelRepo.persist(parceiroObraResponsavel);
	    return parceiroObraResponsavel;
    }
}
