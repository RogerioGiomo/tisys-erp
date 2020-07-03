package br.com.tisyserp.controller.financeiro;

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

import br.com.tisyserp.model.financeiro.SituacaoFinanceira;
import br.com.tisyserp.repository.financeiro.SituacaoFinanceiraRepository;

@Path("/situacaofinanceira")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SituacaoFinanceiraController {
	
	String sql  = "";

    @Inject
	public
    SituacaoFinanceiraRepository SituacaoFinanceiraRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public SituacaoFinanceira getUF(@PathParam("id") final Integer id) throws NoResultException {

		final SituacaoFinanceira resp = SituacaoFinanceiraRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("SituacaoFinanceira - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid SituacaoFinanceira create(@Valid final SituacaoFinanceira situacaofinanceira) {
		SituacaoFinanceiraRepo.persist(situacaofinanceira);
	    return situacaofinanceira;
    }
}
