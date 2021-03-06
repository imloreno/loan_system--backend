package tk.soylorenzo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Sancion {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id_sancion;

	@Column
	private Double monto;

	@Column
	private String descripción;

	// fk_prestamo
	@JoinColumn(name="id_prestamo")
	@ManyToOne(optional=false)
	private Prestamo prestamo;
	
	
	//Getters & setters
	
	public Long getId_sancion() {
		return id_sancion;
	}

	public void setId_sancion(Long id_sancion) {
		this.id_sancion = id_sancion;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public Prestamo getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}
	
	
}
