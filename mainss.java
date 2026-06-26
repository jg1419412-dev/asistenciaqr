public class mainss {
    public static void main(String[] args) {
     docente profesor=new docente("cuitla", "Maestro", 666);

     System.out.println("-----------------docente Registrado-----------------------");
     System.out.println("nombre : "+ profesor.nombre);
     System.out.println("No.empleao:"+profesor.getNumEmpleado());   
    }
}