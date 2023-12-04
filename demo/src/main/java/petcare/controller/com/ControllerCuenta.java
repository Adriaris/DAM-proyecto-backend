package petcare.controller.com;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import petcare.entities.com.Cuenta;
import petcare.service.com.CuentaService;

@RestController
public class ControllerCuenta {
	//CRUD
	
	//AQUÍ IRÁ EL GET DE TODAS LAS CUENTAS
	@Autowired
	CuentaService cuentaService;
	
	@GetMapping(value="cuentas", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Cuenta> retrieveInfo(){
		return cuentaService.getAllCuentas();
	}
	
	@GetMapping(value="cuentas/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Cuenta retrieveCuenta(@PathVariable("id")int id) {
		return cuentaService.retrieveCuenta(id);
	}
	
	@PostMapping(value="cuentasPost", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	boolean altaCuenta(@RequestBody Cuenta cuenta) {
		return cuentaService.addCuenta(cuenta);
	}
	
	@PutMapping(value="cuentasPut", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	boolean UpdateCuenta(@RequestBody Cuenta cuenta) {
		return cuentaService.updateCuenta(cuenta);
	}
	
	@DeleteMapping(value="cuentasDeleteEnt", produces=MediaType.APPLICATION_JSON_VALUE)
	boolean deleteCuentaEnt(@RequestBody Cuenta cuenta) {
		return cuentaService.removeCuenta(cuenta);
	}
	
	@DeleteMapping(value="cuentasDeleteInt", produces=MediaType.APPLICATION_JSON_VALUE)
	boolean deleteCuentaId(@RequestBody int id) {
		return cuentaService.removeCuenta(id);
	}
	
	
	
	//AQUÍ IRÁ LA ELIMINACIÓN DE UNA SOLA CUENTA
	
	//ACTUALIZACIÓN DE UNA CUENTA
	
	//AQUÍ IRÁ LA INSERCIÓN DE UNA CUENTA
}

//CONTROLLER --> RECEPCIONISTA (OYE, ENTRA INFORMACIÓN)
//SERVICE --> GUARDIA DE SEGURIDAD (EL QUE FILTRA LA INFORMACIÓN O DECIDE CUÁL ENTRA Y CUÁL NO)
//DAO --> PERSONAL DE ALMACÉN (EL QUE SE ENCARGA METER EL PRODUCTO Y SACARLO O ACTUALIZARLO)

//EL GUARDIA DE SEGURIDAD PUEDE DECIRLE AL DE ALMACÉN, OYE DAME 3 CUENTAS. EL DE ALMACÉN LE DAS 3 CUENTAS. O LE DICE, TOMA, 2 PAQUETES DE CUENTA, 
//GUARDALAS, Y LAS GUARDA.
//TODA LA INFORMACIÓN PASA POR EL CONTROLLER, QUE ES EL RECEPCIONISTA