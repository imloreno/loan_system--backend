package tk.soylorenzo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Observaciones {
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private Long id_persona;
	
	@Column
	private String observacion;
	
	@Column 
	private String tipo_observacion;
	
	@Column
	private Boolean estado;
	
	
	// Getters y setters

	public Long getId_persona() {
		return id_persona;
	}

	public void setId_persona(Long id_persona) {
		this.id_persona = id_persona;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
