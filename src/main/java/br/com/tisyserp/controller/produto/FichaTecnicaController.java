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

import br.com.tisyserp.model.produto.FichaTecnica;
import br.com.tisyserp.repository.produto.FichaTecnicaRepository;

@Path("/FichaTecnica")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichaTecnicaController {
	
	String sql  = "";

    @Inject
	public
    FichaTecnicaRepository FichaTecnicaRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public FichaTecnica getUF(@PathParam("id") final Integer id) throws NoResultException {

		final FichaTecnica resp = FichaTecnicaRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("FichaTecnica - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid FichaTecnica create(@Valid final FichaTecnica fichaTecnica) {
		FichaTecnicaRepo.persist(fichaTecnica);
	    return fichaTecnica;
    }
}
