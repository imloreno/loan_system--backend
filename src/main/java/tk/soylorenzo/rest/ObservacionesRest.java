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

import tk.soylorenzo.dao.ObservacionesDAO;
import tk.soylorenzo.models.Observaciones;

@CrossOrigin
@RestController
@RequestMapping("observaciones")
public class ObservacionesRest {

	@Autowired
	private ObservacionesDAO observacionesDAO;
	
	//HTTP Request 
	//Post
	@PostMapping("/agregar")
	public Observaciones guardar(@RequestBody Observaciones observacion) { //@RequestBody  Para transformar de JSON a Persona
		return observacionesDAO.save(observacion);
	}
	
	//Get
	@GetMapping("/listar")
	public List<Observaciones> listar() {
		return observacionesDAO.findAll();
	}
	
	//Delete
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		observacionesDAO.deleteById(id);
	}
	
	//Update
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Observaciones observaciones) {
		observacionesDAO.save(observaciones);
		
	}
}
