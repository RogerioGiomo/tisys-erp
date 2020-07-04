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

import br.com.tisyserp.model.pessoa.Parceiro;
import br.com.tisyserp.repository.pessoa.ParceiroRepository;

@Path("/parceiro")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ParceiroController {
	
	String sql  = "";

    @Inject
	public
    ParceiroRepository ParceiroRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Parceiro getId(@PathParam("id") final Long id) throws NoResultException {

		final Parceiro resp = ParceiroRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Parceiro - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid Parceiro create(@Valid final Parceiro parceiro) {
		ParceiroRepo.persist(parceiro);
	    return parceiro;
    }
}
