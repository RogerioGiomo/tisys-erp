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

import br.com.tisyserp.model.fiscal.SituacaoTributariaCofins;
import br.com.tisyserp.repository.fiscal.SituacaoTributariaCofinsRepository;

@Path("/situacaotributariacofins")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SituacaoTributariaCofinsController {
	
	String sql  = "";

    @Inject
	public
    SituacaoTributariaCofinsRepository Repo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public SituacaoTributariaCofins getUF(@PathParam("id") final Integer id) throws NoResultException {

		final SituacaoTributariaCofins resp = Repo.findById(id);
		if (resp == null) {
			throw new NoResultException("SituacaoTributariaCofins - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid SituacaoTributariaCofins create(@Valid final SituacaoTributariaCofins SituacaoTributariaCofins) {
		Repo.persist(SituacaoTributariaCofins);
	    return SituacaoTributariaCofins;
	
    }
}
