public class alumno extends usuario {

    private String matricula;
    private String qr;

    public alumno(String nombre, String rol, String matricula, String qr)
    {
        super(nombre, rol);
        this.matricula=matricula;
        this.qr=qr;
    }
    
    public String getMaricula()
    {
        return matricula;
    }
    public String getQR()
    {
        return qr;
    }
}
