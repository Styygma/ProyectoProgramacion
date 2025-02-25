import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AlumnosPorClase {
    public static void main(String[] args) {
        List<Alumno> alumnos = ListAlumnos.obtenerListaAlumnos();
        Map<String, Long> alumnosPorCurso = alumnos.stream()
                                                   .collect(Collectors.groupingBy(Alumno::getCurso, Collectors.counting()));

        System.out.println("Cantidad de alumnos por curso:");
        System.out.println(alumnosPorCurso);
    }
}
