package org.iesch.AD.busqueda;

import org.iesch.AD.busqueda.servicios.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BusquedaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BusquedaApplication.class, args);
	}

	@Autowired
	DataService dataService;

	@Override
	public void run(String... args) throws Exception {

		dataService.crearDatos();

		dataService.testLazy();

	}
}
