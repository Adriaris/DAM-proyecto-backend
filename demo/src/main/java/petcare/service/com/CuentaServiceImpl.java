package petcare.service.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import petcare.dao.com.InterfaceCuentasDao;
import petcare.entities.com.Cuenta;
@Service
public class CuentaServiceImpl {
	
	@Autowired
	InterfaceCuentasDao daoCuenta;
	
	boolean addCuenta(Cuenta cuenta) {
		if(daoCuenta.retrieveCuenta(cuenta.getIdCuenta()) == null) {
			daoCuenta.addCuenta(cuenta);
			return true;
		}
		return false;
	}
	
	boolean removeCuenta(Cuenta cuenta) {
		if(daoCuenta.retrieveCuenta(cuenta.getIdCuenta()) != null) {
			daoCuenta.removeCuenta(cuenta);
			return true;
		}
		return false;
	}
	
	List<Cuenta> getAllCuentas(){
		return daoCuenta.getAllCuentas();
	}
	boolean removeCuenta(int idCuenta) {
		if(daoCuenta.retrieveCuenta(idCuenta) != null) {
			daoCuenta.removeCuenta(idCuenta);
			return true;
		}
		return false;
	}
	Cuenta retrieveCuenta(int idCuenta) {
		return daoCuenta.retrieveCuenta(idCuenta);
	}
	boolean updateCuenta(Cuenta cuenta) {
		if(daoCuenta.retrieveCuenta(cuenta.getIdCuenta()) != null) {
			daoCuenta.addCuenta(cuenta);
			return true;
		}
		return false;
	}
	
}
