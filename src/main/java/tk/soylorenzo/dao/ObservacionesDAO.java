package tk.soylorenzo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tk.soylorenzo.models.Observaciones;

public interface ObservacionesDAO extends JpaRepository<Observaciones, Integer>{
	
}
