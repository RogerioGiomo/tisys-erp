package br.com.tisyserp.controller.financeiro;

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

import br.com.tisyserp.model.financeiro.Banco;
import br.com.tisyserp.repository.financeiro.BancoRepository;

@Path("/contabancaria")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContaBancariaController {
	
	String sql  = "";

    @Inject
	public
    BancoRepository BancoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Banco getId(@PathParam("id") final Long id) throws NoResultException {

		final Banco resp = BancoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Banco - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  
	@Transactional
    public @Valid Banco create(@Valid final Banco banco) {
		BancoRepo.persist(banco);
	    return banco;
    }
}
