package tk.soylorenzo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Prestamo {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id_prestamo;
	
	@Column
	private Double monto_total;
	
	@Column
	private Double monto_sin_intereses;
	
	@Column
	private Double interes;
	
	@Column
	private Double monto_pagado;
	
	@Column
	private String fecha_inicio;
	
	@Column 
	private String fecha_limite;
	
	@Column
	private String frecuencia_pago; 
	
	@Column 
	private Integer numero_cuotas;
	
	@Column
	private Boolean pendiente;
	
	//Fk_cliente
	@JoinColumn(name = "id_cliente")
	@ManyToOne(optional = false)
	private Persona persona;
	
	//fk_empleado
	@JoinColumn(name="id_empleado")
	@ManyToOne(optional=false)
	private Empleado empleado;
	
	//Getters & setters

	public Double getMonto_total() {
		return monto_total;
	}

	public void setMonto_total(Double monto_total) {
		this.monto_total = monto_total;
	}

	public Double getMonto_sin_intereses() {
		return monto_sin_intereses;
	}

	public void setMonto_sin_intereses(Double monto_sin_intereses) {
		this.monto_sin_intereses = monto_sin_intereses;
	}

	public Double getInteres() {
		return interes;
	}

	public void setInteres(Double interes) {
		this.interes = interes;
	}

	public Double getMonto_pagado() {
		return monto_pagado;
	}

	public void setMonto_pagado(Double monto_pagado) {
		this.monto_pagado = monto_pagado;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_limite() {
		return fecha_limite;
	}

	public void setFecha_limite(String fecha_limite) {
		this.fecha_limite = fecha_limite;
	}

	public String getFrecuencia_pago() {
		return frecuencia_pago;
	}

	public void setFrecuencia_pago(String frecuencia_pago) {
		this.frecuencia_pago = frecuencia_pago;
	}

	public Integer getNumero_cuotas() {
		return numero_cuotas;
	}

	public void setNumero_cuotas(Integer numero_cuotas) {
		this.numero_cuotas = numero_cuotas;
	}

	public Boolean getPendiente() {
		return pendiente;
	}

	public void setPendiente(Boolean pendiente) {
		this.pendiente = pendiente;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Long getId_prestamo() {
		return id_prestamo;
	}

	public void setId_prestamo(Long id_prestamo) {
		this.id_prestamo = id_prestamo;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
}
