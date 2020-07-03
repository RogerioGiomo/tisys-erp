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

import br.com.tisyserp.model.produto.Fabricante;
import br.com.tisyserp.repository.produto.FabricanteRepository;

@Path("/Fabricante")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FabricanteController {
	
	String sql  = "";

    @Inject
	public
    FabricanteRepository FabricanteRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Fabricante getUF(@PathParam("id") final Integer id) throws NoResultException {

		final Fabricante resp = FabricanteRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Fabricante - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid Fabricante create(@Valid final Fabricante fabricante) {
		FabricanteRepo.persist(fabricante);
	    return fabricante;
    }
}
