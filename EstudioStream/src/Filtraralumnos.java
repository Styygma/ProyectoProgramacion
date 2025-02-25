import java.util.List;

public class Filtraralumnos {
    public static void main(String[] args) {
        List<Alumno> alumnos = ListAlumnos.obtenerListaAlumnos();
        System.out.println("Alumnos con nota superior a 7:");
        alumnos.stream()
               .filter(alumno -> alumno.getNotaMedia() > 7)
               .forEach(System.out::println);
    }
}    