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
import tk.soylorenzo.dao.EmpresaDAO;
import tk.soylorenzo.dao.PersonaDAO;
import tk.soylorenzo.models.Empleado;
import tk.soylorenzo.models.Empresa;
import tk.soylorenzo.models.Persona;

@CrossOrigin
@RestController //Decoradores del framework - sirven para inyectar dependencias
@RequestMapping("empleado")
public class EmpleadoRest {
	
	//Attributes
	@Autowired
	private EmpleadoDAO empleadoDAO;
	
	@Autowired
	private EmpresaDAO empresaDAO;
	
	@Autowired
	private PersonaDAO personaDAO;
	
	//HTTP Request 
	//Post
	@PostMapping("/agregar")
	public Empleado guardar(@RequestBody Empleado empleado) { //@RequestBody  Para transformar de JSON a Persona
		Empleado res = empleadoDAO.save(empleado);
		if(res.getId_empleado().equals(null)) return null;
		
		//Find from other tables
		Persona persona = personaDAO.findById(empleado.getPersona().getId_persona()).get();
		Empresa empresa = empresaDAO.findById(empleado.getEmpresa().getId_empresa()).get();
		res.setPersona(persona);
		res.setEmpresa(empresa);
		return res;
	}
	
	//Get
	@GetMapping("/listar")
	public List<Empleado> listar() {
		return empleadoDAO.findAll();
	}
	
	//Get one
	@GetMapping("/obtener/{id}")
	public Empleado obtener(@PathVariable("id") Long id) {
		return empleadoDAO.findById(id).get();
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
