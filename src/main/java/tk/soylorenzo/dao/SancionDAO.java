package tk.soylorenzo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tk.soylorenzo.models.Sancion;

public interface SancionDAO extends JpaRepository<Sancion, Long> {

}
