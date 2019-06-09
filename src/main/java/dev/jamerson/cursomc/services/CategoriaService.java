package dev.jamerson.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.jamerson.cursomc.domain.Categoria;
import dev.jamerson.cursomc.repositories.CategoriaRepository;
import dev.jamerson.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> cat = repo.findById(id);
		return cat.orElseThrow(
				() -> new ObjectNotFoundException(
						"Objeto nao encontrado! Id: " + id + 
						", Tipo: " + Categoria.class.getName()));
	}
}
