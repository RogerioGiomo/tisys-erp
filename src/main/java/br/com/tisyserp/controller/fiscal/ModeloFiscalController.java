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

import br.com.tisyserp.model.fiscal.ModeloFiscal;
import br.com.tisyserp.repository.fiscal.ModeloFiscalRepository;

@Path("/modelofiscal")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ModeloFiscalController {
	
	String sql  = "";

    @Inject
	public
    ModeloFiscalRepository Repo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ModeloFiscal getId(@PathParam("id") final Long id) throws NoResultException {

		final ModeloFiscal resp = Repo.findById(id);
		if (resp == null) {
			throw new NoResultException("ModeloFiscal - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid ModeloFiscal create(@Valid final ModeloFiscal modelofiscal) {
		Repo.persist(modelofiscal);
	    return modelofiscal;
	
    }
}
