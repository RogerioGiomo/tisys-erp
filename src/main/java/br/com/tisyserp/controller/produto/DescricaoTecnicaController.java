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

import br.com.tisyserp.model.produto.DescricaoTecnica;
import br.com.tisyserp.repository.produto.DescricaoTecnicaRepository;

@Path("/DescricaoTecnica")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DescricaoTecnicaController {
	
	String sql  = "";

    @Inject
	public
    DescricaoTecnicaRepository DescricaoTecnicaRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public DescricaoTecnica getUF(@PathParam("id") final Integer id) throws NoResultException {

		final DescricaoTecnica resp = DescricaoTecnicaRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("DescricaoTecnica - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid DescricaoTecnica create(@Valid final DescricaoTecnica DescricaoTecnica) {
		DescricaoTecnicaRepo.persist(DescricaoTecnica);
	    return DescricaoTecnica;
    }
}
