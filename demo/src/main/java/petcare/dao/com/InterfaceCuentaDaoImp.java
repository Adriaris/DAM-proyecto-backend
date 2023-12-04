package petcare.dao.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import petcare.entities.com.Cuenta;
import petcare.service.com.InfoJpaSpring;
@Repository
public class InterfaceCuentaDaoImp {
	
	@Autowired
	InfoJpaSpring infoJpaSpring;
	
	void addCuenta(Cuenta cuenta) {
		infoJpaSpring.save(cuenta);
	}
	void removeCuenta(Cuenta cuenta) {
		infoJpaSpring.delete(cuenta);
	}
	List<Cuenta> getAllCuentas(){
		return infoJpaSpring.findAll();
	}
	void removeCuenta(int idCuenta) {
		infoJpaSpring.deleteById(idCuenta);
	}
	public Cuenta retrieveCuenta(int idCuenta) {
		return infoJpaSpring.findById(idCuenta).orElse(null);
	}
	
	void updateCuenta(Cuenta cuenta) {
		infoJpaSpring.save(cuenta);
	}
}
