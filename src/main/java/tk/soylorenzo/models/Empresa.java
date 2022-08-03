package tk.soylorenzo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empresa {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id_empresa;
	
	@Column
	private String razon_social;
	
	@Column
	private String nit;
	
	@Column
	private String email;
	
	@Column
	private String direccion;
	
	@Column
	private String ciudad;
	
	@Column 
	private String telefono;
	
	
	//Getters & setters

	public String getRazon_social() {
		return razon_social;
	}

	public Long getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(Long id_empresa) {
		this.id_empresa = id_empresa;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
