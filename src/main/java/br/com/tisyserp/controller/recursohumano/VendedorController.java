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

import br.com.tisyserp.model.recursohumano.Vendedor;
import br.com.tisyserp.repository.recursohumano.VendedorRepository;

@Path("/Vendedor")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VendedorController {
	
	String sql  = "";

    @Inject
	public
    VendedorRepository VendedorRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Vendedor getUF(@PathParam("id") final Integer id) throws NoResultException {

		final Vendedor resp = VendedorRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("Vendedor - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid Vendedor create(@Valid final Vendedor Vendedor) {
		VendedorRepo.persist(Vendedor);
	    return Vendedor;
    }
}
