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

import tk.soylorenzo.dao.EmpleadoDAO;
import tk.soylorenzo.models.Empleado;

@CrossOrigin
@RestController //Decoradores del framework - sirven para inyectar dependencias
@RequestMapping("empleado")
public class EmpleadoRest {
	
	@Autowired
	private EmpleadoDAO empleadoDAO;
	
	//HTTP Request 
	//Post
	@PostMapping("/agregar")
	public Empleado guardar(@RequestBody Empleado empleado) { //@RequestBody  Para transformar de JSON a Persona
		empleadoDAO.save(empleado);
		return empleado;
	}
	
	//Get
	@GetMapping("/listar")
	public List<Empleado> listar() {
		return empleadoDAO.findAll();
	}
	
	//Delete
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		empleadoDAO.deleteById(id);
	}
	
	//Update
	@PutMapping("/actualizar")
	public Empleado actualizar(@RequestBody Empleado empleado) {
		empleadoDAO.save(empleado);
		return empleado;
	}
}
