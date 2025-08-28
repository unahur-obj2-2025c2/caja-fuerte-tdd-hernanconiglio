package ar.edu.unahur.obj2.caja;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.tdd.CajaFuerte;

public class CajaFuerteTest {

    private static final int CODIGO_APERTURA = 123;

    @Test
    public void alCrearUnaCajaFuerteDeberiaEstarAbierta() {
        // Preparaci�n - given (dado)
        // Ejecuci�n - when (cuando)
        CajaFuerte caja = this.cuandoCreoUnaCajaFuerte();
        // Validacci�n - then (entonces)
        this.entoncesLaCajaFuerteEstaAbierta(caja);
    }

    @Test
    public void alCerrarDeberiaEstarCerrada() {
        CajaFuerte caja = this.dadoQueExisteCajaFuerte();
        cuandoCierroLaCajaFuerte(caja);
        entoncesLaCajaFuerteEstaCerrada(caja);
    }

    @Test
    public void alAbrirLaCajaFuerteConElCodigoDeCierreDeberiaEstarAbierta() {
        CajaFuerte caja = this.dadoQueExisteCajaFuerte();
        this.dadoQueCierroLaCajaFuerte(caja, CODIGO_APERTURA);
        this.cuandoAbroLaCajaFuerteCon(caja, CODIGO_APERTURA);
        this.entoncesLaCajaFuerteEstaAbierta(caja);
    }

    @Test
    public void alAbrirLaCajaFuerteConUnCodigoErroneoNoDeberiaAbrirse() {
        CajaFuerte caja = this.dadoQueExisteCajaFuerte();
        this.dadoQueCierroLaCajaFuerte(caja, CODIGO_APERTURA);
        this.cuandoAbroLaCajaFuerteCon(caja, CODIGO_APERTURA + 5);
        this.entoncesLaCajaFuerteEstaCerrada(caja);
    }

    private void cuandoAbroLaCajaFuerteCon(CajaFuerte caja, Integer codigoDeApertura) {
        caja.abrir(codigoDeApertura);
    }

    private void dadoQueCierroLaCajaFuerte(CajaFuerte caja, Integer codigoDeApertura) {
        caja.cerrar(codigoDeApertura);
    }

    private void entoncesLaCajaFuerteEstaCerrada(CajaFuerte caja) {
        assertFalse(caja.estaAbierta());
    }

    private void cuandoCierroLaCajaFuerte(CajaFuerte caja) {
        caja.cerrar(CODIGO_APERTURA);
    }

    private CajaFuerte dadoQueExisteCajaFuerte() {
        return new CajaFuerte();
    }

    private void entoncesLaCajaFuerteEstaAbierta(CajaFuerte caja) {
        assertTrue(caja.estaAbierta());
    }

    private CajaFuerte cuandoCreoUnaCajaFuerte() {
        return new CajaFuerte();
    }
}