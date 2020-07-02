package br.com.tisyserp.controller.produto;

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

import br.com.tisyserp.model.produto.FichaTecnicaItem;
import br.com.tisyserp.repository.produto.FichaTecnicaItemRepository;

@Path("/FichaTecnicaItem")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichaTecnicaItemController {
	
	String sql  = "";

    @Inject
	public
    FichaTecnicaItemRepository FichaTecnicaItemRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public FichaTecnicaItem getUF(@PathParam("id") final Integer id) throws NoResultException {

		final FichaTecnicaItem resp = FichaTecnicaItemRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("FichaTecnicaItem - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid FichaTecnicaItem create(@Valid final FichaTecnicaItem FichaTecnicaItem) {
		FichaTecnicaItemRepo.persist(FichaTecnicaItem);
	    return FichaTecnicaItem;
    }
}
