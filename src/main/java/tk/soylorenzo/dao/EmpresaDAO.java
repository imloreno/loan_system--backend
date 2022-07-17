package tk.soylorenzo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tk.soylorenzo.models.Empresa;

public interface EmpresaDAO extends JpaRepository<Empresa, Long> {

}
