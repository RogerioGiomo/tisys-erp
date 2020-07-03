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

import br.com.tisyserp.model.pessoa.ParceiroTipoEndereco;
import br.com.tisyserp.repository.pessoa.ParceiroTipoEnderecoRepository;

@Path("/ParceiroTipoEndereco")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ParceiroTipoEnderecoController {
	
	String sql  = "";

    @Inject
	public
    ParceiroTipoEnderecoRepository ParceiroTipoEnderecoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ParceiroTipoEndereco getUF(@PathParam("id") final Integer id) throws NoResultException {

		final ParceiroTipoEndereco resp = ParceiroTipoEnderecoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("ParceiroTipoEndereco - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid ParceiroTipoEndereco create(@Valid final ParceiroTipoEndereco ParceiroTipoEndereco) {
		ParceiroTipoEnderecoRepo.persist(ParceiroTipoEndereco);
	    return ParceiroTipoEndereco;
    }
}
