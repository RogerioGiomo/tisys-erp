package br.com.tisyserp.controller.fiscal;

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

import br.com.tisyserp.model.fiscal.SituacaoTributariaIpi;
import br.com.tisyserp.repository.fiscal.SituacaoTributariaIpiRepository;

@Path("/situacaotributariaipi")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SituacaoTributariaIpiController {
	
	String sql  = "";

    @Inject
	public
    SituacaoTributariaIpiRepository Repo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public SituacaoTributariaIpi getUF(@PathParam("id") final Integer id) throws NoResultException {

		final SituacaoTributariaIpi resp = Repo.findById(id);
		if (resp == null) {
			throw new NoResultException("SituacaoTributariaIpi - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid SituacaoTributariaIpi create(@Valid final SituacaoTributariaIpi SituacaoTributariaIpi) {
		Repo.persist(SituacaoTributariaIpi);
	    return SituacaoTributariaIpi;
	
    }
}
