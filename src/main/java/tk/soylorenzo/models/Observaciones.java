package tk.soylorenzo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Observaciones {
	@Id
	private Integer id;
	
	@Column
	private Integer id_persona;
	
	@Column
	private String observacion;
	
	@Column 
	private String tipo_observacion;
	
	@Column
	private Boolean estado;
	
	
	// Getters y setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_persona() {
		return id_persona;
	}

	public void setId_persona(Integer id_persona) {
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
	
	
}
