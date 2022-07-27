package tk.soylorenzo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.soylorenzo.dao.PrestamoDAO;
import tk.soylorenzo.models.Prestamo;

@CrossOrigin
@RestController //Decoradores del framework - sirven para inyectar dependencias
@RequestMapping("prestamo")
public class PrestamoRest {
	
	@Autowired
	private PrestamoDAO prestamoDAO;
	
	//HTTP Request 
	//Post
	@PostMapping("/agregar")
	public Prestamo guardar(@RequestBody Prestamo prestamo) { //@RequestBody  Para transformar de JSON Prestamos
		return prestamoDAO.save(prestamo);
	}
	
	//Get
	@GetMapping("/listar")
	public List<Prestamo> listar() {
		return prestamoDAO.findAll();
	}
	
	//Delete
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		prestamoDAO.deleteById(id);
	}
	
	//Update
	@PutMapping("/actualizar")
	public Prestamo actualizar(@RequestBody Prestamo prestamo) {
		return prestamoDAO.save(prestamo);
	}
		
	
}
