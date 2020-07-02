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

import br.com.tisyserp.model.pessoa.ParceiroFinanceiro;
import br.com.tisyserp.repository.pessoa.ParceiroFinanceiroRepository;

@Path("/ParceiroFinanceiro")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ParceiroFinanceiroController {
	
	String sql  = "";

    @Inject
	public
    ParceiroFinanceiroRepository ParceiroFinanceiroRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ParceiroFinanceiro getUF(@PathParam("id") final Integer id) throws NoResultException {

		final ParceiroFinanceiro resp = ParceiroFinanceiroRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("ParceiroFinanceiro - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid ParceiroFinanceiro create(@Valid final ParceiroFinanceiro ParceiroFinanceiro) {
		ParceiroFinanceiroRepo.persist(ParceiroFinanceiro);
	    return ParceiroFinanceiro;
    }
}
