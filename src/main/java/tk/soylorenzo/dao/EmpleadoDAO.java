package tk.soylorenzo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tk.soylorenzo.models.Empleado;

public interface EmpleadoDAO extends JpaRepository<Empleado, Long> {

}
