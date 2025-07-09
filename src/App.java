import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;
import DAO.EmpleadoDAO;
import DAO.EmpleadoDAOHasMap;
import DAO.EmpleadoDAOTreeMap;
import models.Empleado;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjercicios(); // ✅ Descomenta esta línea para ejecutar los ejercicios
    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHasMap();
        EmpleadoContoller empleadoContoller = new EmpleadoContoller(empleadoDAOHash);

        EmpleadoDAO empleadoDAOTree = new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoContoller2 = new EmpleadoContoller(empleadoDAOTree);

        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");

        empleadoContoller.agregarEmpleado(emp1);
        empleadoContoller.agregarEmpleado(emp2);
        empleadoContoller.agregarEmpleado(emp3);
        empleadoContoller.agregarEmpleado(emp4);
        empleadoContoller.agregarEmpleado(emp5);

        empleadoContoller2.agregarEmpleado(emp1);
        empleadoContoller2.agregarEmpleado(emp2);
        empleadoContoller2.agregarEmpleado(emp3);
        empleadoContoller2.agregarEmpleado(emp4);
        empleadoContoller2.agregarEmpleado(emp5);

        empleadoContoller.list();
        empleadoContoller2.list();
    }

    private static void runEjercicios() {
        Ejercicios ej = new Ejercicios();

        System.out.println("areAnagrams(\"Escuchar\", \"silencio\"): " + Ejercicios.areAnagrams("Escuchar", "silencio"));
        System.out.println("areAnagrams(\"hola\", \"bello\"): " + Ejercicios.areAnagrams("hola", "bello"));
        System.out.println("areAnagrams(\"triangulo\", \"integral\"): " + Ejercicios.areAnagrams("triangulo", "integral"));

        int[] resultado = ej.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5);
        System.out.println("sumatoriaDeDos([9,2,3,6], 5): " + (resultado != null ? Arrays.toString(resultado) : "null"));

        resultado = ej.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 10);
        System.out.println("sumatoriaDeDos([9,2,3,6], 10): " + (resultado != null ? Arrays.toString(resultado) : "null"));

        System.out.print("contarCaracteres(\"hola\"): ");
        ej.contarCaracteres("hola");

        System.out.println("sonAnagramas(\"roma\", \"amor\"): " + ej.sonAnagramas("roma", "amor"));
        System.out.println("sonAnagramas(\"raton\", \"trona\"): " + ej.sonAnagramas("raton", "trona"));
    }
}
