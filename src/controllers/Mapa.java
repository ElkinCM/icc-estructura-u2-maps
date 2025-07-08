package controllers;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
    }

    public void ejemploConHashMap() {
        Map<String, String> capitales = new HashMap<>();
        capitales.put("Ecuador", "Quito");
        capitales.put("Perú", "Lima");
        capitales.put("Colombia", "Bogotá");

        System.out.println("Capitales de países:");
        System.out.println(capitales.keySet());

        for (String pais : capitales.keySet()) {
            System.out.println("La capital de " + pais + " es " + capitales.get(pais));
        }

        String capital = capitales.get("Ecuador");
        System.out.println("La capital de Ecuador es " + capital);

        Map<Integer, Empleado> empleados = new HashMap<>();
        empleados.put(3, new Empleado(3, "Juan", "Tester"));
        empleados.put(1, new Empleado(1, "Ana", "Desarrolladora"));
        empleados.put(2, new Empleado(2, "Pedro", "Gerente"));
        empleados.put(4, new Empleado(4, "María", "Diseñadora"));

        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " - Empleado: " + entry.getValue().getName() + " - Cargo: " + entry.getValue().getPosition());
        }

        Map<Empleado, Integer> empleadosdos = new HashMap<>();
        Empleado emp1 = new Empleado(1, "Ana", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Dev");
        Empleado emp3 = new Empleado(3, "Ana", "Dev");
        Empleado emp4 = new Empleado(3, "María", "Dev");

        empleadosdos.put(emp1, 1000);
        empleadosdos.put(emp2, 1200);
        empleadosdos.put(emp3, 1500);
        empleadosdos.put(emp4, 1800);

        for (Map.Entry<Empleado, Integer> entry : empleadosdos.entrySet()) {
            System.out.println("Empleado: " + entry.getKey().getName() + " - Salario: " + entry.getValue());
        }
    }

    public void ejemploConLinkedHashMap() {
        Map<Integer, String> productos = new LinkedHashMap<>();
        productos.put(1, "Laptop");
        productos.put(2, "Smartphone");
        productos.put(3, "Teclado");
        productos.put(4, "Mouse");

        System.out.println("Listado de productos");
        for (Integer id : productos.keySet()) {
            System.out.println("ID: " + id + " - Producto: " + productos.get(id));
        }
    }


    public void ejemploConTreeMap() {
        Map<Integer, String> personas = new TreeMap<>();
        personas.put(1, "Juan");
        personas.put(2, "Ana");
        personas.put(3, "Pedro");
        personas.put(4, "María");
        System.out.println("Listado de personas ordenadas por ID:");
        for (Integer id : personas.keySet()) {
            System.out.println("ID: " + id + " - Nombre: " + personas.get(id));
        }

        Map<Empleado, Integer> empleadosdos = new TreeMap<>(Comparator.comparingInt(Empleado::getId));
        Empleado emp1 = new Empleado(1, "Ana", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Dev");
        Empleado emp3 = new Empleado(3, "Ana", "Dev");
        Empleado emp4 = new Empleado(3, "María", "Dev");

        empleadosdos.put(emp1, 1000);
        empleadosdos.put(emp2, 1200);
        empleadosdos.put(emp3, 1500);
        empleadosdos.put(emp4, 1800);

        for (Map.Entry<Empleado, Integer> entry : empleadosdos.entrySet()) {
            System.out.println("Empleado: " + entry.getKey().getName() + " - Salario: " + entry.getValue());
        }
    }
}
