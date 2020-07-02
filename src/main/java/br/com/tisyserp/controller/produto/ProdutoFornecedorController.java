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

import br.com.tisyserp.model.produto.ProdutoFornecedor;
import br.com.tisyserp.repository.produto.ProdutoFornecedorRepository;

@Path("/ProdutoFornecedor")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoFornecedorController {
	
	String sql  = "";

    @Inject
	public
    ProdutoFornecedorRepository ProdutoFornecedorRepo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ProdutoFornecedor getUF(@PathParam("id") final Integer id) throws NoResultException {

		final ProdutoFornecedor resp = ProdutoFornecedorRepo.findById(id);
		if (resp == null) {
			throw new NoResultException("ProdutoFornecedor - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid ProdutoFornecedor create(@Valid final ProdutoFornecedor ProdutoFornecedor) {
		ProdutoFornecedorRepo.persist(ProdutoFornecedor);
	    return ProdutoFornecedor;
    }
}