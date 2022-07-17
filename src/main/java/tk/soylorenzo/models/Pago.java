package tk.soylorenzo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pago {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id_pago;
	
	@Column
	private String fecha_pago;
	
	@Column
	private Double monto;
	
	// fk_id_prestamo Integer
	@JoinColumn(name="id_prestamo")
	@ManyToOne(optional=false)
	private Prestamo prestamo;
	
	

	//Getters y setters
	
	public String getFecha_pago() {
		return fecha_pago;
	}

	public void setFecha_pago(String fecha_pago) {
		this.fecha_pago = fecha_pago;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Long getId_pago() {
		return id_pago;
	}

	public void setId_pago(Long id_pago) {
		this.id_pago = id_pago;
	}

	public Prestamo getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}
	
}
