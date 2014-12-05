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
    
/*Pregunta INT => Long?*/
public class MultiplicaPorSumaSucesiva{
    
    /*Se decrementa siempre el factor1 y se suma el factor2*/
    public static BigInteger multiplica(BigInteger factor1 , BigInteger factor2 ){
        
        if(factor1.compareTo(new BigInteger("0"))==0 || factor1.compareTo(new BigInteger("0"))==0 ) {
             return  new BigInteger("0");
        }
        else {
            return    metodoRecursivo(factor1,factor2);
            
        }
       
    }
    
    private static BigInteger metodoRecursivo(BigInteger factor1, BigInteger factor2){
        if(factor1.compareTo(new BigInteger("1"))==0) return factor2;
        else return factor2.add(metodoRecursivo(factor1.subtract(new BigInteger("1")) , factor2)) ;
    }
}
