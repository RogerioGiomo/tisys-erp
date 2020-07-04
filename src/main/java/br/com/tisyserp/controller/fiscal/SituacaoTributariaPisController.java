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

import br.com.tisyserp.model.fiscal.SituacaoTributariaPis;
import br.com.tisyserp.repository.fiscal.SituacaoTributariaPisRepository;

@Path("/situacaotributariapis")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SituacaoTributariaPisController {
	
	String sql  = "";

    @Inject
	public
    SituacaoTributariaPisRepository Repo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public SituacaoTributariaPis getId(@PathParam("id") final Long id) throws NoResultException {

		final SituacaoTributariaPis resp = Repo.findById(id);
		if (resp == null) {
			throw new NoResultException("SituacaoTributariaPis - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid SituacaoTributariaPis create(@Valid final SituacaoTributariaPis situacaotributariapis) {
		Repo.persist(situacaotributariapis);
	    return situacaotributariapis;
	
    }
}
