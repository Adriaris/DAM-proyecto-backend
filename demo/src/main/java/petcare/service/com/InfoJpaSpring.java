package petcare.service.com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import petcare.entities.com.Cuenta;
@Service
public interface InfoJpaSpring extends JpaRepository<Cuenta, Integer> {
	@Transactional
	@Modifying
	@Query("Delete from cuenta i Where i.idCuenta=?1")
	void removeByName(int id);
}
