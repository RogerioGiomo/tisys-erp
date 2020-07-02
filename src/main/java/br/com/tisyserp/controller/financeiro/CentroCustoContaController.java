package br.com.tisyserp.controller.financeiro;

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

import br.com.tisyserp.model.financeiro.CentroCustoConta;
import br.com.tisyserp.repository.financeiro.CentroCustoContaRepository;

@Path("/centrcustoconta")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CentroCustoContaController {
	
	String sql  = "";

    @Inject
	public
    CentroCustoContaRepository CentroCustoContaRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public CentroCustoConta getUF(@PathParam("id") final Integer id) throws NoResultException {

		final CentroCustoConta resp = CentroCustoContaRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("CentroCustoConta - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid CentroCustoConta create(@Valid final CentroCustoConta CentroCustoConta) {
		CentroCustoContaRepo.persist(CentroCustoConta);
	    return CentroCustoConta;
    }
}
