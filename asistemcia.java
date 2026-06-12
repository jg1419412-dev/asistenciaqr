import java.util.Date;

public class asistemcia {
    private alumno nombreAlumno;
    private Date fecha;

    public asistemcia(alumno nombreAlumno)
    {
        this.nombreAlumno=nombreAlumno;
        this.fecha=fecha;

    }
    public void mostrarAsistencia()
    {
        System.out.print(nombreAlumno.getNombre()+ "  "+nombreAlumno.getMaricula()+"  "+fecha);
    }


}

