package br.com.tisyserp.controller.recursohumano;

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

import br.com.tisyserp.model.recursohumano.Departamento;
import br.com.tisyserp.repository.recursohumano.DepartamentoRepository;

@Path("/departamento")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DepartamentoController {
	
	String sql  = "";

    @Inject
	public
    DepartamentoRepository DepartamentoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Departamento getId(@PathParam("id") final Long id) throws NoResultException {

		final Departamento resp = DepartamentoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Departamento - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid Departamento create(@Valid final Departamento departamento) {
		DepartamentoRepo.persist(departamento);
	    return departamento;
    }
}
