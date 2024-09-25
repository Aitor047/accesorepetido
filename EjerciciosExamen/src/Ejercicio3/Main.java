package Ejercicio3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Paco", 21);
        Persona persona2 = new Persona("Pepe", 30);
        Persona persona3 = new Persona("Pedro", 39);
        Persona persona4 = new Persona("Pepito", 10);
        Persona persona5 = new Persona("Pepinillo", 31);
        Persona persona6 = new Persona("Prosti", 80);

        List<Persona> listaPersonas = List.of(persona1, persona2, persona3, persona4, persona5, persona6);
        double edadPromedio = listaPersonas.stream().mapToInt(Persona::getId).average().orElse(0);
        System.out.println("Edad promedio: " + edadPromedio);

        Persona personaJoven = listaPersonas.stream().min((p1, p2) -> p1.getId() - p2.getId()).orElse(null);
        System.out.println("Persona más joven: " + personaJoven);

        List<String> mayoresDe30 = listaPersonas.stream().filter(p -> p.getId() > 30).map(Persona::getNombre).toList();
        System.out.println("Personas mayores de 30: " + mayoresDe30);
    }
}
