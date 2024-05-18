package com.app.opticeasy.opticeasyapp;

import com.app.opticeasy.opticeasyapp.models.Persona;
import com.app.opticeasy.opticeasyapp.models.TipoDocumento;
import com.app.opticeasy.opticeasyapp.service.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class OpticeasyAppApplication implements CommandLineRunner {

	@Autowired
	private PersonaServiceImpl personaService;

	public static void main(String[] args) {
		SpringApplication.run(OpticeasyAppApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {


		//Metodo para buscar una persona por su ID
		/*Optional<Persona> persona = personaService.buscarPersonaPorId(3L);
		if (persona.isPresent()){
			System.out.println("Persona encontrada: " + persona);
		} else {
			System.out.println("Persona no encontrada. ");
		}*/


		//Metodo para listar todas las personas de la tabla
		//List<Persona> personas = personaService.buscarPersonas();
		//personas.stream().forEach(persona -> System.out.println(persona));



		//Metodo para guardar o actualizar persona
		Persona persona = new Persona();
		//Si queremos guardar una nueva persona comentamos el ID, si queremos actualizar una existente, descomentamos el ID y agregamos uno que exista
		//persona.setIdPersona(3L);
		persona.setApellido("Juan Sebastian");
		persona.setNombre("Romero Castillo");
		persona.setCorreo("sebastian@gmail.com");
		persona.setDireccion("Bosa");
		persona.setFechaCreacion(new Date());
		persona.setFechaNacimiento(new Date());
		persona.setNumeroDocumento("1003457128");
		persona.setTelefono("3124596293");
		TipoDocumento tipoDocumento = new TipoDocumento();
		tipoDocumento.setIdTipoDocumento(1L);
		persona.setTipoDocumento(tipoDocumento);
		personaService.guardarPersona(persona);


		//Metodo para eliminar persona
		//personaService.eliminarPersonaPorId(2L);


	}
}
