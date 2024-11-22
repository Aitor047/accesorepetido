package org.iesch.AD.busqueda.servicios;

import jakarta.transaction.Transactional;
import org.iesch.AD.busqueda.model.Autor;
import org.iesch.AD.busqueda.model.Libro;
import org.iesch.AD.busqueda.repositorios.AutorRepository;
import org.iesch.AD.busqueda.repositorios.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    @Autowired
    LibroRepository libroRepository;

    @Autowired
    AutorRepository autorRepository;

    public void crearDatos() {

        Autor autor = new Autor();
        autor.setNombre("Cervantes");
        autorRepository.save(autor);

        Libro libro = new Libro();
        libro.setTitle("El quijote");
        libro.setAutor(autor);
        libroRepository.save(libro);

        Libro libro1 = new Libro();
        libro1.setTitle("La Galatea");
        libro1.setAutor(autor);
        libroRepository.save(libro1);

        Libro libro2 = new Libro();
        libro2.setTitle("Los trabajos de Persiles y Segismunda");
        libro2.setAutor(autor);
        libroRepository.save(libro2);

    }

    @Transactional
    public void testLazy() {

        System.out.println("Mostrar todos los libros");

        libroRepository.findAll().forEach(book -> {
            System.out.println("Titulo del libro: " + book.getTitle());

            try {
                System.out.println("Me duermo -----------------------");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Autor: " + book.getAutor().getNombre());

        });

    }

}























