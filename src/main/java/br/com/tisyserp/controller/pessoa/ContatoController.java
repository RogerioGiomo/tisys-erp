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

import br.com.tisyserp.model.pessoa.Contato;
import br.com.tisyserp.repository.pessoa.ContatoRepository;

@Path("/contato")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContatoController {
	
	String sql  = "";

    @Inject
	public
    ContatoRepository ContatoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Contato getId(@PathParam("id") final Long id) throws NoResultException {

		final Contato resp = ContatoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Contato - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid Contato create(@Valid final Contato contato) {
		ContatoRepo.persist(contato);
	    return contato;
    }
}
