package dev.jamerson.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.jamerson.cursomc.domain.Pedido;
import dev.jamerson.cursomc.repositories.PedidoRepository;
import dev.jamerson.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> cat = repo.findById(id);
		return cat.orElseThrow(
				() -> new ObjectNotFoundException(
						"Objeto nao encontrado! Id: " + id + 
						", Tipo: " + Pedido.class.getName()));
	}
}
