package br.com.tisyserp.controller.pessoa;

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

import br.com.tisyserp.model.pessoa.Cidade;
import br.com.tisyserp.repository.pessoa.CidadeRepository;

@Path("/cidade")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CidadeController {
	
	String sql  = "";

    @Inject
	public
    CidadeRepository CidadeRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Cidade getId(@PathParam("id") final Long id) throws NoResultException {

		final Cidade resp = CidadeRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Cidade - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid Cidade create(@Valid final Cidade cidade) {
		CidadeRepo.persist(cidade);
	    return cidade;
    }
}
