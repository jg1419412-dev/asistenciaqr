public class mainss {
    public static void main(String[] args) {
     docente profesor=new docente("cuitla", "Maestro", 666);

     System.out.println("-----------------docente Registrado-----------------------");
     System.out.println("nombre : "+ profesor.nombre);
     System.out.println("No.empleao:"+profesor.getNumEmpleado()); 
     
     System.out.println();

     grupo grupoProgramacion = new grupo("Pooo");
    alumno alumno1 = new alumno("adan", "Alumno", "2530532", "123456");
    alumno alumno2 = new alumno("noe", "Alumno", "2530781", "654987");
    alumno alumno3 = new alumno("chistin", "Alumno", "2330088", "789456");
    alumno alumno4 = new alumno("juje", "Alumno", "2530036", "369852");
    alumno alumno5 = new alumno("angelo", "Alumno", "2530230", "741258");
   
   grupoProgramacion.agregarAlumnos(alumno1); 
   grupoProgramacion.agregarAlumnos(alumno2); 
   grupoProgramacion.agregarAlumnos(alumno3); 
   grupoProgramacion.agregarAlumnos(alumno4); 
   grupoProgramacion.agregarAlumnos(alumno5);
   
   sistemaAsistencia sistema = new sistemaAsistencia();

   sistema.registrarAlumno(alumno1);
   sistema.registrarAlumno(alumno2);
   sistema.registrarAlumno(alumno3);
   sistema.registrarAlumno(alumno4);
   sistema.registrarAlumno(alumno5);

   System.out.println("grupo: "+ grupoProgramacion.getGrupo());
   System.out.println("Los alumnos de este grupo: ");
   for (alumno a : grupoProgramacion.getAlumnos()){
    System.out.println("-" +a.getNombre()     + ":" + " " +a.getMaricula() + "  ");
        }
        System.out.println();


        System.out.println("-----Registrando asistencias con codigo QRs-------");
        sistema.registrarAsistencia("123456");
        sistema.registrarAsistencia("654987");
        sistema.registrarAsistencia("789456");
        sistema.registrarAsistencia("369852");
        sistema.registrarAsistencia("741258");
        sistema.registrarAsistencia("951753");


    }
} 