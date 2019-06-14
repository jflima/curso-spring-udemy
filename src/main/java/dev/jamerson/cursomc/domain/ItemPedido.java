package dev.jamerson.cursomc.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ItemPedido implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Double desconto;
	private Integer quantidade;
	private Double preco;
	
	@EmbeddedId
	private ItemPedidoPK id = new ItemPedidoPK();
	
	public ItemPedido() {
		
	}

	public ItemPedido(Pedido pedido, Produto produto, Double desconto, Integer quantidade, Double preco) {
		super();
		this.desconto = desconto;
		this.quantidade = quantidade;
		this.preco = preco;
		
		id.setPedido(pedido);
		id.setProduto(produto);
		
	}
	
	public Pedido getPedido() {
		return id.getPedido();
	}
	
	public Produto getProduto() {
		return id.getProduto();
	}
	
}
