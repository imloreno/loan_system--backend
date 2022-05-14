package tk.soylorenzo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.soylorenzo.dao.PersonaDAO;
import tk.soylorenzo.models.Persona;

@RestController
@RequestMapping("persona")
public class PersonaRest {
	
	@Autowired
	private PersonaDAO personaDAO;
	
	//HTTP Request 
	//Get
	@PostMapping("/agregar")
	public void guardar(@RequestBody Persona persona) { //@RequestBody  Para transformar de JSON a Persona
		personaDAO.save(persona);
	}
	
	@GetMapping("/listar")
	public List<Persona> listar() {
		return personaDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		personaDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Persona persona) {
		personaDAO.save(persona);
		
	}
}