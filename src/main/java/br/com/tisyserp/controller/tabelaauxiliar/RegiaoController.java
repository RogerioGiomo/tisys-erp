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

import br.com.tisyserp.model.TabelaAuxiliar.Regiao;
import br.com.tisyserp.repository.tabelaauxiliar.RegiaoRepository;

@Path("/Regiao")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RegiaoController {
	
	String sql  = "";

    @Inject
	public
    RegiaoRepository RegiaoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Regiao getUF(@PathParam("id") final Integer id) throws NoResultException {

		final Regiao resp = RegiaoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Regiao - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid Regiao create(@Valid final Regiao regiao) {
		RegiaoRepo.persist(regiao);
	    return regiao;
    }
}
