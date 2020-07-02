package br.com.tisyserp.controller.produto;

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

import br.com.tisyserp.model.produto.Instrumento;
import br.com.tisyserp.repository.produto.InstrumentoRepository;

@Path("/Instrumento")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class InstrumentoController {
	
	String sql  = "";

    @Inject
	public
    InstrumentoRepository InstrumentoRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Instrumento getUF(@PathParam("id") final Integer id) throws NoResultException {

		final Instrumento resp = InstrumentoRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Instrumento - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid Instrumento create(@Valid final Instrumento Instrumento) {
		InstrumentoRepo.persist(Instrumento);
	    return Instrumento;
    }
}
