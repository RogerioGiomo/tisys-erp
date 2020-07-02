package br.com.tisyserp.controller.recursohumano;

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

import br.com.tisyserp.model.recursohumano.Funcionario;
import br.com.tisyserp.repository.recursohumano.FuncionarioRepository;

@Path("/Funcionario")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FuncionarioController {
	
	String sql  = "";

    @Inject
	public
    FuncionarioRepository FuncionarioRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Funcionario getUF(@PathParam("id") final Integer id) throws NoResultException {

		final Funcionario resp = FuncionarioRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Funcionario - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid Funcionario create(@Valid final Funcionario Funcionario) {
		FuncionarioRepo.persist(Funcionario);
	    return Funcionario;
    }
}
