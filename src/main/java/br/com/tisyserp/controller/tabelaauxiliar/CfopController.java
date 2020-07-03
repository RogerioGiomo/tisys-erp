package br.com.tisyserp.controller.tabelaauxiliar;

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

import br.com.tisyserp.model.TabelaAuxiliar.Cfop;
import br.com.tisyserp.repository.tabelaauxiliar.CfopRepository;

@Path("/Cfop")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CfopController {
	
	String sql  = "";

    @Inject
	public
    CfopRepository CfopRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Cfop getUF(@PathParam("id") final Integer id) throws NoResultException {

		final Cfop resp = CfopRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Cfop - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid Cfop create(@Valid final Cfop cfop) {
		CfopRepo.persist(cfop);
	    return cfop;
    }
}
