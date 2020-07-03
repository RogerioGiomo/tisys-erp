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

import br.com.tisyserp.model.produto.Assunto;
import br.com.tisyserp.repository.produto.AssuntoRepository;

@Path("/assunto")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AssuntoController {
	
	String sql  = "";

    @Inject
	public
    AssuntoRepository AssuntoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Assunto getUF(@PathParam("id") final Integer id) throws NoResultException {

		final Assunto resp = AssuntoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Assunto - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  
	@Transactional
    public @Valid Assunto create(@Valid final Assunto Assunto) {
		AssuntoRepo.persist(Assunto);
	    return Assunto;
    }
}
