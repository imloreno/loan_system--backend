package tk.soylorenzo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Empleado {
	
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	private Long id_empleado;
	
	@Column
	private String cargo;
	
	@Column(unique = true)
	private String nombre_usuario;
	
	@Column
	private String clave_ingreso;
	
	@Column
	private Boolean estado;
	
	//Relaciones

	@JoinColumn(name = "id_persona")
	@OneToOne(optional = false)
	private Persona persona;
	
	@JoinColumn(name="id_empresa")
	@OneToOne(optional=true)
	private Empresa empresa;



	//Getters y setters
	
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Long getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(Long id_empleado) {
		this.id_empleado = id_empleado;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getClave_ingreso() {
		return clave_ingreso;
	}

	public void setClave_ingreso(String clave_ingreso) {
		this.clave_ingreso = clave_ingreso;
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
