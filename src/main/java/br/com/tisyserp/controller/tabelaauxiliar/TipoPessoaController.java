package br.com.tisyserp.controller.tabelaauxiliar;

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

import br.com.tisyserp.model.TabelaAuxiliar.TipoPessoa;
import br.com.tisyserp.repository.tabelaauxiliar.TipoPessoaRepository;

@Path("/TipoPessoa")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TipoPessoaController {
	
	String sql  = "";

    @Inject
	public
    TipoPessoaRepository TipoPessoaRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public TipoPessoa getUF(@PathParam("id") final Integer id) throws NoResultException {

		final TipoPessoa resp = TipoPessoaRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("TipoPessoa - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid TipoPessoa create(@Valid final TipoPessoa TipoPessoa) {
		TipoPessoaRepo.persist(TipoPessoa);
	    return TipoPessoa;
    }
}
