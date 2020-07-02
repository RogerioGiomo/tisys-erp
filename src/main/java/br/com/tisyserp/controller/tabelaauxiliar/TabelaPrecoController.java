package br.com.tisyserp.controller.tabelaauxiliar;

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

import br.com.tisyserp.model.TabelaAuxiliar.TabelaPreco;
import br.com.tisyserp.repository.tabelaauxiliar.TabelaPrecoRepository;

@Path("/TabelaPreco")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TabelaPrecoController {
	
	String sql  = "";

    @Inject
	public
    TabelaPrecoRepository TabelaPrecoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public TabelaPreco getUF(@PathParam("id") final Integer id) throws NoResultException {

		final TabelaPreco resp = TabelaPrecoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("TabelaPreco - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid TabelaPreco create(@Valid final TabelaPreco TabelaPreco) {
		TabelaPrecoRepo.persist(TabelaPreco);
	    return TabelaPreco;
    }
}
