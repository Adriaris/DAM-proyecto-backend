package com.example.demo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Contact;
import com.example.demo.AboutUs;

@RestController
public class Controller {
	@GetMapping(value="contact", produces = MediaType.APPLICATION_JSON_VALUE)
	public Contact devolverContact() {
		Contact contacto = new Contact("PetCare", "Pelai", 122, "correo@gmail.com");
		return contacto;
	}
	
	@GetMapping(value="aboutUs", produces = MediaType.APPLICATION_JSON_VALUE)
	public AboutUs devolverAboutUs() {
		AboutUs aboutUs = new AboutUs("Este es nuestro About us sobre nuestra aplicación");
		return aboutUs;
	}
	
	
	
	

}
