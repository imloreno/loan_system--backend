package tk.soylorenzo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Garantia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_garantia;

	@Column
	private String nombre_garantia;

	// Falta por hacer el fk_id_prestamo

	@Column
	private String desripcion_garantia;

	@Column
	private Double valor_estimado;
	
	@JoinColumn(name="id_prestamo")
	@ManyToOne
	private Prestamo prestamo;
	
	
	//Getters & setters

	public Long getId_garantia() {
		return id_garantia;
	}

	public void setId_garantia(Long id_garantia) {
		this.id_garantia = id_garantia;
	}

	public String getNombre_garantia() {
		return nombre_garantia;
	}

	public void setNombre_garantia(String nombre_garantia) {
		this.nombre_garantia = nombre_garantia;
	}

	public String getDesripcion_garantia() {
		return desripcion_garantia;
	}

	public void setDesripcion_garantia(String desripcion_garantia) {
		this.desripcion_garantia = desripcion_garantia;
	}

	public Double getValor_estimado() {
		return valor_estimado;
	}

	public void setValor_estimado(Double valor_estimado) {
		this.valor_estimado = valor_estimado;
	}

}
