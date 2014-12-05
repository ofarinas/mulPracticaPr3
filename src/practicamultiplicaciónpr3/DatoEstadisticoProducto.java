/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamultiplicaciónpr3;

import java.math.BigInteger;

/**
 *
 * @author osvaldo
 */
public class DatoEstadisticoProducto {
   private long tiempo  ;
   private BigInteger resultadoProducto ;

    public DatoEstadisticoProducto(long tiempo, BigInteger bigInteger) {
        this.tiempo = tiempo;
        this.resultadoProducto = bigInteger;
    }

    public long getTiempo() {
        return tiempo;
    }

   
    public BigInteger getBigInteger() {
        return resultadoProducto;
    }

    public void setBigInteger(BigInteger bigInteger) {
        this.resultadoProducto = bigInteger;
    }
   
}
