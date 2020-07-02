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

import br.com.tisyserp.model.pessoa.ParceiroEndereco;
import br.com.tisyserp.repository.pessoa.ParceiroEnderecoRepository;

@Path("/ParceiroEndereco")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ParceiroEnderecoController {
	
	String sql  = "";

    @Inject
	public
    ParceiroEnderecoRepository ParceiroEnderecoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ParceiroEndereco getUF(@PathParam("id") final Integer id) throws NoResultException {

		final ParceiroEndereco resp = ParceiroEnderecoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("ParceiroEndereco - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid ParceiroEndereco create(@Valid final ParceiroEndereco ParceiroEndereco) {
		ParceiroEnderecoRepo.persist(ParceiroEndereco);
	    return ParceiroEndereco;
    }
}