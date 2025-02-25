import java.util.List;
import java.util.Comparator;

public class OrdenarAlumnos {
    public static void main(String[] args) {
        List<Alumno> alumnos = ListAlumnos.obtenerListaAlumnos();
        System.out.println("Alumnos ordenados por nota (descendente):");
        alumnos.stream()
               .sorted(Comparator.comparingDouble(Alumno::getNotaMedia).reversed())
               .forEach(System.out::println);
    }
}
