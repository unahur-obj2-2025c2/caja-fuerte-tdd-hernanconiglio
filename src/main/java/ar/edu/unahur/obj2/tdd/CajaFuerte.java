package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {
    private Integer codigo = 1234;
    private Boolean estaAbierta=Boolean.TRUE;

    public Boolean estaAbierta() {
        return estaAbierta;
    }

    public void abrir(Integer codigoDeApertura) {
        if (this.codigo.equals(codigoDeApertura)) {
            this.estaAbierta = Boolean.TRUE;
        }
    }

    public void cerrar(Integer codigoDeApertura) {
        this.estaAbierta = Boolean.FALSE;
        this.codigo = codigoDeApertura;
    }

}
