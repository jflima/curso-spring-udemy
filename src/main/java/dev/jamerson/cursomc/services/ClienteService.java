package dev.jamerson.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.jamerson.cursomc.domain.Cliente;
import dev.jamerson.cursomc.repositories.ClienteRepository;
import dev.jamerson.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> cat = repo.findById(id);
		return cat.orElseThrow(
				() -> new ObjectNotFoundException(
						"Objeto nao encontrado! Id: " + id + 
						", Tipo: " + Cliente.class.getName()));
	}
}
