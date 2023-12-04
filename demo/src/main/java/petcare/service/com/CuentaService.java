package petcare.service.com;

import java.util.List;

import petcare.entities.com.Cuenta;

public interface CuentaService {
	boolean addCuenta(Cuenta cuenta);
	boolean removeCuenta(Cuenta cuenta);
	List<Cuenta> getAllCuentas();
	boolean removeCuenta(int idCuenta);
	Cuenta retrieveCuenta(int idCuenta);
	boolean updateCuenta(Cuenta cuenta);
}
