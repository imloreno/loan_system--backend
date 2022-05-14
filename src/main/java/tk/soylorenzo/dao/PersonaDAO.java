package tk.soylorenzo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tk.soylorenzo.models.Persona;

public interface PersonaDAO extends JpaRepository<Persona, Integer>{
	
}
