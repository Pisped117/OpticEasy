package com.app.opticeasy.opticeasyapp;

import com.app.opticeasy.opticeasyapp.models.Persona;
import com.app.opticeasy.opticeasyapp.models.TipoDocumento;
import com.app.opticeasy.opticeasyapp.presentation.PersonaFx;
import com.app.opticeasy.opticeasyapp.service.PersonaServiceImpl;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class OpticeasyAppApplication {



	public static void main(String[] args) {
		//SpringApplication.run(OpticeasyAppApplication.class, args);
		Application.launch(PersonaFx.class, args);
	}
/*

	@Override
	public void run(String... args) throws Exception {
		findOne();
	}

	public void save(){

		//Metodo para guardar o actualizar persona
		Persona persona = new Persona();
		//Si queremos guardar una nueva persona comentamos el ID, si queremos actualizar una existente, descomentamos el ID y agregamos uno que exista
		//persona.setIdPersona(3L);
		persona.setApellido("Romero Castillo");
		persona.setNombre("Juan Sebastian");
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

	}

	public void find() {
		//Metodo para listar todas las personas de la tabla
		List<Persona> personas = personaService.buscarPersonas();
		personas.stream().forEach(persona -> System.out.println(persona));
	}

	public void findOne() {
		//Metodo para buscar una persona por su ID
		System.out.println(personaService.buscarPersonaPorId(5l));
	}

	public void deletePerson() {

		//Metodo para eliminar persona
		personaService.eliminarPersonaPorId(4L);

	}*/
}
