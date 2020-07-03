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

import br.com.tisyserp.model.TabelaAuxiliar.RamoAtividade;
import br.com.tisyserp.repository.tabelaauxiliar.RamoAtividadeRepository;

@Path("/RamoAtividade")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RamoAtividadeController {
	
	String sql  = "";

    @Inject
	public
    RamoAtividadeRepository RamoAtividadeRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public RamoAtividade getUF(@PathParam("id") final Integer id) throws NoResultException {

		final RamoAtividade resp = RamoAtividadeRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("RamoAtividade - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid RamoAtividade create(@Valid final RamoAtividade RamoAtividade) {
		RamoAtividadeRepo.persist(RamoAtividade);
	    return RamoAtividade;
    }
}
