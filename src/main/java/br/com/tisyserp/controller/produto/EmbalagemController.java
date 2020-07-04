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

import br.com.tisyserp.model.produto.Embalagem;
import br.com.tisyserp.repository.produto.EmbalagemRepository;

@Path("/Embalagem")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmbalagemController {
	
	String sql  = "";

    @Inject
	public
    EmbalagemRepository EmbalagemRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Embalagem getId(@PathParam("id") final Long id) throws NoResultException {

		final Embalagem resp = EmbalagemRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Embalagem - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid Embalagem create(@Valid final Embalagem embalagem) {
		EmbalagemRepo.persist(embalagem);
	    return embalagem;
    }
}
