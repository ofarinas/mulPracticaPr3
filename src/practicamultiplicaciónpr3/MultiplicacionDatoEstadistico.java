/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamultiplicaciónpr3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author osvaldo
 */
public class MultiplicacionDatoEstadistico {

    List<DatoEstadisticoProducto> datoEstadisticoProductos;

    public MultiplicacionDatoEstadistico() {
        datoEstadisticoProductos = new ArrayList<>();
    }

    public boolean add(BigInteger bigInteger,long tiempo) {
        return datoEstadisticoProductos.add(new DatoEstadisticoProducto(tiempo, bigInteger));
    }

    public DatoEstadisticoProducto get(int index) {
        return datoEstadisticoProductos.get(index);
    }
 
}
