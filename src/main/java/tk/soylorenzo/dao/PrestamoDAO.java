package tk.soylorenzo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tk.soylorenzo.models.Prestamo;

public interface PrestamoDAO extends JpaRepository<Prestamo, Long> {

}
