package tk.soylorenzo.rest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
import tk.soylorenzo.dao.PrestamoDAO;
import tk.soylorenzo.models.Pago;
import tk.soylorenzo.models.Prestamo;

@CrossOrigin
@RestController //Decoradores del framework - sirven para inyectar dependencias
@RequestMapping("pago")
public class PagoRest {
	
	@Autowired
	private PagoDAO pagoDAO;
	
	@Autowired
	private PrestamoDAO prestamoDAO;
	
	//HTTP Request 
	//Post
	@PostMapping("/agregar")
	public Pago guardar(@RequestBody Pago pago) { //@RequestBody  Para transformar de JSON a Persona
		
		//Setting date
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date(Calendar.getInstance().getTimeInMillis());
		pago.setFecha_pago(formatter.format(date));
		Pago resPago = pagoDAO.save(pago);		
		
		//Obteniendo lista de pagos
		List<Pago> ListaPagos = pagoDAO.findByIdPrestamo(pago.getPrestamo().getId_prestamo());
		Double amount = 0.0;
		for(int i = 0; i < ListaPagos.size(); i++) {
			amount += ListaPagos.get(i).getMonto();
		}
		System.out.println("\r Lista de pagos \n");
		System.out.println(ListaPagos.size());
		Prestamo prestamo = prestamoDAO.getById(pago.getPrestamo().getId_prestamo());
		prestamo.setMonto_pagado(amount);
		prestamo.setPendiente(amount < prestamo.getMonto_total());
		
		prestamoDAO.save(prestamo);
		return resPago;
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
	public void actualizar(@RequestBody Pago pago) {
		pagoDAO.save(pago);
		
	}
}
