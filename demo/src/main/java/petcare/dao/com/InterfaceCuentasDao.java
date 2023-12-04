package petcare.dao.com;

import java.util.List;

import petcare.entities.com.Cuenta;

public interface InterfaceCuentasDao {
	void addCuenta(Cuenta cuenta);
	void removeCuenta(Cuenta cuenta);
	List<Cuenta> getAllCuentas();
	void removeCuenta(int idCuenta);
	Cuenta retrieveCuenta(int idCuenta);
	void updateCuenta(Cuenta cuenta);
}
