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

import br.com.tisyserp.model.fiscal.SerieFiscal;
import br.com.tisyserp.repository.fiscal.SerieFiscalRepository;

@Path("/seriefiscal")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SerieFiscalController  {
	
	String sql  = "";

    @Inject
	public
    SerieFiscalRepository Repo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public SerieFiscal getId(@PathParam("id") final Long id) throws NoResultException {

		final SerieFiscal resp = Repo.findById(id);
		if (resp == null) {
			throw new NoResultException("SerieFiscal - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid SerieFiscal create(@Valid final SerieFiscal seriefiscal) {
		Repo.persist(seriefiscal);
	    return seriefiscal;
	
    }
}
