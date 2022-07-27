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

import tk.soylorenzo.dao.GarantiaDAO;
import tk.soylorenzo.models.Garantia;

@CrossOrigin
@RestController //Decoradores del framework - sirven para inyectar dependencias
@RequestMapping("garantia")
public class GarantiaRest {

	@Autowired
	private GarantiaDAO garantiaDAO;
	
	//HTTP Request 
	//Post
	@PostMapping("/agregar")
	public Garantia guardar(@RequestBody Garantia garantia) { //@RequestBody  Para transformar de JSON a Garantia
		return garantiaDAO.save(garantia);
	}
	
	//Get
	@GetMapping("/listar")
	public List<Garantia> listar() {
		return garantiaDAO.findAll();
	}
		
	//Delete
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		garantiaDAO.deleteById(id);
	}
	
	//Update
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Garantia garantia) {
		garantiaDAO.save(garantia);
		
	}
	
}
