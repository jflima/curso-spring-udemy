package dev.jamerson.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.jamerson.cursomc.domain.Pedido;
import dev.jamerson.cursomc.services.PedidoService;

@RequestMapping(value="/pedidos")
@RestController
public class PedidoResource {
	
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		
		Pedido cat1 = service.buscar(id);
		return ResponseEntity.ok().body(cat1);
	}
}
