package org.iesch.AD.MiPrimerCRUD;

import org.iesch.AD.MiPrimerCRUD.model.Persona;
import org.iesch.AD.MiPrimerCRUD.repositorio.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class MiPrimerCrudApplication implements CommandLineRunner {

	@Autowired
	PersonaRepository personaRepository;

	public static void main(String[] args) {
		SpringApplication.run(MiPrimerCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Persona persona1 = new Persona();
//		persona1.setNombre("Aitor");
//		persona1.setApellido("Monzon");
//		persona1.setEmail("aitorbronch@gmail.com");
//		persona1.setTelefono(638563217);
//		persona1.setCiudad("Bonchales");
//		persona1.setDirecccion("C/ Casto Rubio, 19");
//		persona1.setDni("18470122H");
//
//		Persona persona2 = new Persona();
//		persona2.setNombre("Diego");
//		persona2.setApellido("Asensio");
//		persona2.setEmail("diegoasensio@gmail.com");
//		persona2.setTelefono(987654321);
//		persona2.setCiudad("Teruel");
//		persona2.setDirecccion("Plaza del torico");
//		persona2.setDni("18470122H");
//
//		Persona persona3 = new Persona();
//		persona3.setNombre("Paul");
//		persona3.setApellido("Perez");
//		persona3.setEmail("paulperez@gmail.com");
//		persona3.setTelefono(465789312);
//		persona3.setCiudad("Teruel");
//		persona3.setDirecccion("Calle 321");
//		persona3.setDni("18470122H");
//
//		Persona persona4 = new Persona();
//		persona4.setNombre("Ruben");
//		persona4.setApellido("Saez");
//		persona4.setEmail("rubensaez@gmail.com");
//		persona4.setTelefono(123654789);
//		persona4.setCiudad("Zaragoza");
//		persona4.setDirecccion("Calle 300");
//		persona4.setDni("18470122H");
//
//		List<Persona> lista = Arrays.asList(persona1, persona2, persona3, persona4);
//		personaRepository.saveAll(lista);
//		System.out.println(lista);
//
//
//
//		lista.forEach(System.out::println);

		// SELECT BY ID
		Optional<Persona> personaById = personaRepository.findById(3L);
		System.out.println(personaById.get());
		System.out.println("--------------------------------------");

		Persona person = personaRepository.findById(1L).orElse(null);
		System.out.println(person);
		System.out.println("--------------------------------------");

		// UPDATE
//		Optional<Persona> personaUpdate = personaRepository.findById(3L);
//		personaUpdate.get().setNombre("El nuevo nombre");
		// Asi con el resto del objeto
//		personaRepository.save(personaUpdate.get());

		// DELETE
		//personaRepository.deleteById(1L);


		// BUSCAR POR CIUDAD
		List<Persona> lista = personaRepository.findByCiudad("Teruel");
		lista.forEach(System.out::println); 


//		List<Persona> lista1 = personaRepository.findByCiudadOrDirecccion("Teruel", "Plaza del torico");
//		System.out.println(lista1);
//
//		List<Persona> lista2 = personaRepository.buscarPorCiudadEmail("Teruel", "diegoasensio@gmail.com");
//		System.out.println(lista2);

		System.exit(1);

	}
}
