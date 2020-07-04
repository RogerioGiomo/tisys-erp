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

import br.com.tisyserp.model.fiscal.SituacaoTributaria;
import br.com.tisyserp.repository.fiscal.SituacaoTributariaRepository;

@Path("/situacaotributaria")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SituacaoTributariaController {
	
	String sql  = "";

    @Inject
	public
    SituacaoTributariaRepository Repo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public SituacaoTributaria getId(@PathParam("id") final Long id) throws NoResultException {

		final SituacaoTributaria resp = Repo.findById(id);
		if (resp == null) {
			throw new NoResultException("SituacaoTributaria - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid SituacaoTributaria create(@Valid final SituacaoTributaria situacaotributaria) {
		Repo.persist(situacaotributaria);
	    return situacaotributaria;
	
    }
}
