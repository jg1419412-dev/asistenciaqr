public class qr {
    private qr codigoQr;

    public qr(qr codigoQR)
    {
        this.codigoQr=codigoQR;
    }

    public qr getQString(){
        return codigoQr;
    }
    public boolean validar(String codigoIngresado)
    {
        return codigoQr.equals(codigoIngresado);
    }
}
