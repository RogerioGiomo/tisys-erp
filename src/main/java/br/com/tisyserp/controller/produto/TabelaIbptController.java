package br.com.tisyserp.controller.produto;

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

import br.com.tisyserp.model.produto.TabelaIbpt;
import br.com.tisyserp.repository.produto.TabelaIbptRepository;

@Path("/TabelaIbpt")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TabelaIbptController {
	
	String sql  = "";

    @Inject
	public
    TabelaIbptRepository TabelaIbptRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public TabelaIbpt getId(@PathParam("id") final Long id) throws NoResultException {

		final TabelaIbpt resp = TabelaIbptRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("TabelaIbpt - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid TabelaIbpt create(@Valid final TabelaIbpt tabelaIbpt) {
		TabelaIbptRepo.persist(tabelaIbpt);
	    return tabelaIbpt;
    }
}
