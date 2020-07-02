package br.com.tisyserp.controller.pessoa;

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

import br.com.tisyserp.model.pessoa.ParceiroContato;
import br.com.tisyserp.repository.pessoa.ParceiroContatoRepository;

@Path("/ParceiroContato")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ParceiroContatoController {
	
	String sql  = "";

    @Inject
	public
    ParceiroContatoRepository ParceiroContatoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ParceiroContato getUF(@PathParam("id") final Integer id) throws NoResultException {

		final ParceiroContato resp = ParceiroContatoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("ParceiroContato - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid ParceiroContato create(@Valid final ParceiroContato ParceiroContato) {
		ParceiroContatoRepo.persist(ParceiroContato);
	    return ParceiroContato;
    }
}