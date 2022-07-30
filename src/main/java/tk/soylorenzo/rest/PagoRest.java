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

import tk.soylorenzo.dao.PagoDAO;
import tk.soylorenzo.dao.PersonaDAO;
import tk.soylorenzo.models.Pago;
import tk.soylorenzo.models.Persona;

@CrossOrigin
@RestController //Decoradores del framework - sirven para inyectar dependencias
@RequestMapping("pago")
public class PagoRest {
	
	@Autowired
	private PagoDAO pagoDAO;
	
	//HTTP Request 
	//Post
	@PostMapping("/agregar")
	public Pago guardar(@RequestBody Pago persona) { //@RequestBody  Para transformar de JSON a Persona
		return pagoDAO.save(persona);
	}
	
	//Get
	@GetMapping("/listar")
	public List<Pago> listar() {
		return pagoDAO.findAll();
	}
	
	//Delete
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		pagoDAO.deleteById(id);
	}
	
	//Update
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Pago persona) {
		pagoDAO.save(persona);
		
	}
}
