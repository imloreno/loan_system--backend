package tk.soylorenzo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Observaciones {
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	private Long id_observacion;
	
	@Column
	private String observacion;
	
	@Column 
	private String tipo_observacion;
	
	@Column
	private Boolean estado;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="id_persona")
	private Persona persona;
	
	
	// Getters y setters
	
	public Long getId() {
		return id_observacion;
	}

	public void setId(Long id) {
		this.id_observacion = id;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getTipo_observacion() {
		return tipo_observacion;
	}

	public void setTipo_observacion(String tipo_observacion) {
		this.tipo_observacion = tipo_observacion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
}
