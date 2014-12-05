/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamultiplicaciónpr3;

import java.math.BigInteger;

/**
 *
 * @author usuario
 */
public class MultiplicacionEgipcia {

    public static BigInteger multiplicacionEgipcia(BigInteger bigInteger1, BigInteger bigInteger2) {
        Producto producto = multiplicaEgipcia(bigInteger1, bigInteger2, new BigInteger("1"));
        return producto.bigIntegerResultado;
    }

    private  static Producto multiplicaEgipcia(BigInteger n, BigInteger m, BigInteger double1) {
        if (double1.compareTo(m) == 1) {
            return new Producto(new BigInteger("0"), new BigInteger("0"));
        }
        if (double1.compareTo(m) != 1) {
            Producto mul = multiplicaEgipcia(n, m, double1.multiply(new BigInteger("2")));
            if (mul.bigInteger2Aux.add(double1).compareTo(m) != 1) {
                return new Producto(mul.bigIntegerResultado.add(n.multiply(double1)), mul.bigInteger2Aux.add(double1));
            } else {
                return mul;
            }
        }
        return null;
    }
}
 class Producto {
   BigInteger bigIntegerResultado ;   
   BigInteger bigInteger2Aux ;

    public Producto(BigInteger bigInteger, BigInteger bigInteger2) {
        this.bigIntegerResultado = bigInteger;
        this.bigInteger2Aux = bigInteger2;
    }

   
    
}
