package tk.soylorenzo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tk.soylorenzo.models.Pago;

public interface PagoDAO extends JpaRepository<Pago, Long>{

	@Query(value = "SELECT * from Pago p WHERE p.id_prestamo = ?1", nativeQuery = true)
	public List<Pago> findByIdPrestamo(Long id);
	
}
