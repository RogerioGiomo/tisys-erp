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

import br.com.tisyserp.model.TabelaAuxiliar.Empresa;
import br.com.tisyserp.repository.tabelaauxiliar.EmpresaRepository;

@Path("/Empresa")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmpresaController {
	
	String sql  = "";

    @Inject
	public
    EmpresaRepository EmpresaRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Empresa getUF(@PathParam("id") final Integer id) throws NoResultException {

		final Empresa resp = EmpresaRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Empresa - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid Empresa create(@Valid final Empresa Empresa) {
		EmpresaRepo.persist(Empresa);
	    return Empresa;
    }
}
