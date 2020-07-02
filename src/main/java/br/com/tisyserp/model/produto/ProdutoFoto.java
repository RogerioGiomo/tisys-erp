package br.com.tisyserp.model.produto;



import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "produto_foto")

public class ProdutoFoto  extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer foto_id;
	
	@JoinColumn(name = "foto_prod_id", referencedColumnName = "prod_id")  // Codigo dos itens da receita codigo fiho
	public Produto prod_id;

	@Lob @Column(name="foto_imagem")
	public byte[] picture;
	
}