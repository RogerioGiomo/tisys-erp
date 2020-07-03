package br.com.tisyserp.controller.recursohumano;

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

import br.com.tisyserp.model.recursohumano.Funcao;
import br.com.tisyserp.repository.recursohumano.FuncaoRepository;

@Path("/funcao")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FuncaoController {
	
	String sql  = "";

    @Inject
	public
    FuncaoRepository FuncaoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Funcao getUF(@PathParam("id") final Integer id) throws NoResultException {

		final Funcao resp = FuncaoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Funcao - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid Funcao create(@Valid final Funcao Funcao) {
		FuncaoRepo.persist(Funcao);
	    return Funcao;
    }
}
