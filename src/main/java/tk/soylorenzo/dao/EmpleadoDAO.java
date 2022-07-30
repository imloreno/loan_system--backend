package tk.soylorenzo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tk.soylorenzo.models.Empleado;

public interface EmpleadoDAO extends JpaRepository<Empleado, Long> {
	
}
