package petcare.service.com;

import java.util.List;

import org.springframework.stereotype.Service;

import petcare.entities.com.Cuenta;
@Service
public interface CuentaService {
	boolean addCuenta(Cuenta cuenta);
	boolean removeCuenta(Cuenta cuenta);
	List<Cuenta> getAllCuentas();
	boolean removeCuenta(int idCuenta);
	Cuenta retrieveCuenta(int idCuenta);
	boolean updateCuenta(Cuenta cuenta);
}
