public class docente extends usuario {

    private int NumEmpleado;

    public docente(String nombre,String rol,int NumEmpleado)
    {
        super(nombre,rol);
        this.NumEmpleado=NumEmpleado;
    }
    
    public int getNumEmpleado()
    {
        return NumEmpleado;
    }

}

