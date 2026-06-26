public class qr {
    
    private String codigoQr;

    public qr (String codigoQR)
    {
        this.codigoQr=codigoQR;
    }

    public String getQString(){
        return codigoQr;
    }
    public boolean validar(String codigoIngresado)
    {
        return codigoQr.equals(codigoIngresado);
    }
}
