import java.util.Date;
import java.util.List;

public class Ejercicio6 {
    class Universidad{
        private String nombreU;
        private String nombreRector;
        private String ciudad;
        private List <Facultad> facultades;
    }
    class Facultad{
        private String nombreF;
        private int profesores;
        private int estudiantes;
        private int carreras;
        private int cursos;
        private List <Carrera> Carrerras;
        private Profesor profeAsociado;
    }
    class Carrera{
        private String nombreCa;
        private int creditos;
        private int numSemestres;
        private String nivel;
        private String facultad;
        private List <Curso> cursosCa;
        private List <Estudiante> estudiantesC;
    }
    class Curso{
        private int codigo;
        private String nombreCur;
        private int numCreditos;
        private String carreraRelacionada;
        private int numSalon;
        private String profesorCur;
        private String estudiantesCur;

    }
    class Persona{
        private int cedula;
        private int nombrePer;
        private Date fechaNacimiento;
        private String ciudadNacimiento;
        private String deptoNacimiento;
        private String paisNacimiento;
    }
    class Estudiante extends Persona{
        private int semActual;
        private String carreraEst;
        private Date fechaIngreso;
    }
    class Profesor extends Persona{
        private String profesion;
        private String nacionalidad;
        private float sueldo;
    }
}
