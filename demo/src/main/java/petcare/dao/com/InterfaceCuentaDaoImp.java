package petcare.dao.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import petcare.entities.com.Cuenta;
import petcare.service.com.InfoJpaSpring;
@Repository
public class InterfaceCuentaDaoImp implements InterfaceCuentasDao{
	
	@Autowired
	InfoJpaSpring infoJpaSpring;
	
	@Override
	public void addCuenta(Cuenta cuenta) {
		infoJpaSpring.save(cuenta);
	}
	@Override
	public void removeCuenta(Cuenta cuenta) {
		infoJpaSpring.delete(cuenta);
	}
	@Override
	public List<Cuenta> getAllCuentas(){
		return infoJpaSpring.findAll();
	}
	@Override
	public void removeCuenta(int idCuenta) {
		infoJpaSpring.deleteById(idCuenta);
	}
	@Override
	public Cuenta retrieveCuenta(int idCuenta) {
		return infoJpaSpring.findById(idCuenta).orElse(null);
	}
	@Override
	public void updateCuenta(Cuenta cuenta) {
		infoJpaSpring.save(cuenta);
	}
}
