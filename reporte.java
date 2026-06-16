import java.util.List;

public class reporte {
    public void generar(List<asistencia> asistencias){
        System.out.println("== Reporte de asistencia==");
        for (asistencia asis : asistencias){
            asis.mostrarAsistencia();
        }

    }
}
