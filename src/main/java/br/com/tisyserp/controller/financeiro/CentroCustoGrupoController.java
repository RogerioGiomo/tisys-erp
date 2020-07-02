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

import br.com.tisyserp.model.financeiro.CentroCustoGrupo;
import br.com.tisyserp.repository.financeiro.CentroCustoGrupoRepository;

@Path("/centrocustogrupo")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CentroCustoGrupoController {
	
	String sql  = "";

    @Inject
	public
    CentroCustoGrupoRepository CentroCustoGrupoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public CentroCustoGrupo getUF(@PathParam("id") final Integer id) throws NoResultException {

		final CentroCustoGrupo resp = CentroCustoGrupoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("CentroCustoGrupo - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid CentroCustoGrupo create(@Valid final CentroCustoGrupo CentroCustoGrupo) {
		CentroCustoGrupoRepo.persist(CentroCustoGrupo);
	    return CentroCustoGrupo;
    }
}
