package tk.soylorenzo.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Persona {
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	private Long id_persona;
	
	@Column
	private String nombres;
	
	@Column
	private String apellidos;
	
	@Column
	private String fecha_nacimiento;
	
	@Column
	private String email;
	
	@Column
	private String direccion;
	
	@Column
	private String telefono;
	
	@Column
	private String ci;
	
	@Column
	private Boolean estado;
	
	
	
	//Getters & setters

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Long getId_persona() {
		return id_persona;
	}

	public void setId_persona(Long id_persona) {
		this.id_persona = id_persona;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
}
