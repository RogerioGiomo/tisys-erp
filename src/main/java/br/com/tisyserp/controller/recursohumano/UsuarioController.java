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

import br.com.tisyserp.model.recursohumano.Usuario;
import br.com.tisyserp.repository.recursohumano.UsuarioRepository;

@Path("/Usuario")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioController {
	
	String sql  = "";

    @Inject
	public
    UsuarioRepository UsuarioRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Usuario getUF(@PathParam("id") final Integer id) throws NoResultException {

		final Usuario resp = UsuarioRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Usuario - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid Usuario create(@Valid final Usuario Usuario) {
		UsuarioRepo.persist(Usuario);
	    return Usuario;
    }
}
