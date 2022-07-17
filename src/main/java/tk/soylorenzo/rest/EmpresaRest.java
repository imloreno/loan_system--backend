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

import tk.soylorenzo.dao.EmpresaDAO;
import tk.soylorenzo.models.Empresa;

@CrossOrigin
@RestController //Decoradores del framework - sirven para inyectar dependencias
@RequestMapping("empresa")
public class EmpresaRest {
	//Attributes
	@Autowired
	private EmpresaDAO empresaDAO;
	
	//HTTP Request 
	//Post
	@PostMapping("/agregar")
	public Empresa guardar(@RequestBody Empresa empresa) { //@RequestBody  Para transformar de JSON a Empresa
		empresaDAO.save(empresa);
		return empresa;
	}
	
	//Get
	@GetMapping("/listar")
	public List<Empresa> listar() {
		return empresaDAO.findAll();
	}
	
	//Delete
	@DeleteMapping("/eliminar/{id_empresa}")
	public void eliminar(@PathVariable("id_empresa") Long id_empresa) {
		empresaDAO.deleteById(id_empresa);
	}
	
	//Update
	@PutMapping("/actualizar")
	public Empresa actualizar(@RequestBody Empresa empresa) {
		empresaDAO.save(empresa);
		return empresa;
	}
}
