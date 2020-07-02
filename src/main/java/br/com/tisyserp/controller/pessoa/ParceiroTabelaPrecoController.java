package br.com.tisyserp.controller.pessoa;

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

import br.com.tisyserp.model.pessoa.ParceiroTabelaPreco;
import br.com.tisyserp.repository.pessoa.ParceiroTabelaPrecoRepository;

@Path("/ParceiroTabelaPreco")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ParceiroTabelaPrecoController {
	
	String sql  = "";

    @Inject
	public
    ParceiroTabelaPrecoRepository ParceiroTabelaPrecoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ParceiroTabelaPreco getUF(@PathParam("id") final Integer id) throws NoResultException {

		final ParceiroTabelaPreco resp = ParceiroTabelaPrecoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("ParceiroTabelaPreco - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid ParceiroTabelaPreco create(@Valid final ParceiroTabelaPreco ParceiroTabelaPreco) {
		ParceiroTabelaPrecoRepo.persist(ParceiroTabelaPreco);
	    return ParceiroTabelaPreco;
    }
}
