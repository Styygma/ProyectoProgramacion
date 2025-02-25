import java.util.List;
import java.util.stream.Collectors;

public class NombreAlumnos {
    public static void main(String[] args) {
        List<Alumno> alumnos = ListAlumnos.obtenerListaAlumnos();
        List<String> nombres = alumnos.stream()
                                      .map(Alumno::getNombre)
                                      .collect(Collectors.toList());

        System.out.println("Lista de nombres de alumnos:");
        nombres.forEach(System.out::println);
    }
}
