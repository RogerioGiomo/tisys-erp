package br.com.tisyserp.controller.produto;

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

import br.com.tisyserp.model.produto.Editora;
import br.com.tisyserp.repository.produto.EditoraRepository;

@Path("/Editora")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EditoraController {
	
	String sql  = "";

    @Inject
	public
    EditoraRepository EditoraRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Editora getUF(@PathParam("id") final Integer id) throws NoResultException {

		final Editora resp = EditoraRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Editora - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST  @Transactional
    public @Valid Editora create(@Valid final Editora Editora) {
		EditoraRepo.persist(Editora);
	    return Editora;
    }
}
