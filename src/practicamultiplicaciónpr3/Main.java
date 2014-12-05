package practicamultiplicaciónpr3;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        String[] numeros = {"9", "99", "999", "9999", "99999", "999999"};
        MultiplicacionDatoEstadistico multiplicacionDatoEstadisticoEgipcia = new MultiplicacionDatoEstadistico();
        MultiplicacionDatoEstadistico multiplicacionDatoEstadisticoRusa = new MultiplicacionDatoEstadistico();
        MultiplicacionDatoEstadistico multiplicacionDatoEstadisticoSumaSucesiva = new MultiplicacionDatoEstadistico();
        //calcula los tiempos y los resultados de los diferentes métodos de multiplicación
        long  tiempo;
        for (String numero : numeros) {
            tiempo = System.currentTimeMillis();
            BigInteger temp = MultiplicacionRusa.multiplicacionRusa(new BigInteger(numero), new BigInteger(numero));
           //calcuala el tiempo de  multiplicación rusa
            tiempo = System.currentTimeMillis() - tiempo;
            multiplicacionDatoEstadisticoRusa.add(temp, tiempo);
        if (numero.length()<=3){
             tiempo = System.currentTimeMillis();
             temp = MultiplicaPorSumaSucesiva.multiplica(new BigInteger(numero), new BigInteger(numero));
             //calcualar el tiempo de  multiplicación de suma Sucesiva
            tiempo = System.currentTimeMillis() - tiempo;
            multiplicacionDatoEstadisticoSumaSucesiva.add(temp, tiempo);
        }
            tiempo = System.currentTimeMillis();
            temp = MultiplicacionEgipcia.multiplicacionEgipcia(new BigInteger(numero), new BigInteger(numero));
            //calcualar el tiempo de  multiplicación egipcia 
            tiempo = System.currentTimeMillis() - tiempo;
            multiplicacionDatoEstadisticoEgipcia.add(temp, tiempo);

        }
        //muestra el tiempo en ejecutarse cada meétodo de multiplicación
        System.out.printf("%15s %15s %20s %20s \n ","Tamaño de las ristras","Tiempo Sumas","Tiempo Rusa","Tiempo Egipcia");
        for (int i = 0; i < numeros.length; i++) {
         System.out.printf("%10d %20s %20d %20d \n ",numeros[i].length(), i<=2 ?String.valueOf(multiplicacionDatoEstadisticoSumaSucesiva.get(i).getTiempo()):"---" 
                                                         ,multiplicacionDatoEstadisticoRusa.get(i).getTiempo()
                                                         ,multiplicacionDatoEstadisticoEgipcia.get(i).getTiempo());
      
                    }
        System.out.println("----------------------------------------------------------------------");
       //muestra el resultado de la multiplicación
        System.out.printf("%15s %15s %20s %20s \n ","Tamaño de las ristras","Resultado Sumas","Tiempo Rusa","Tiempo Egipcia");
        for (int i = 0; i < numeros.length; i++) {
         System.out.printf("%10d %20s %20d %20d \n ",numeros[i].length(), i<=2 ?String.valueOf(multiplicacionDatoEstadisticoSumaSucesiva.get(i).getBigInteger()):"---" 
                                                         ,multiplicacionDatoEstadisticoRusa.get(i).getBigInteger()
                                                         ,multiplicacionDatoEstadisticoEgipcia.get(i).getBigInteger());
      
            
        }
        
    }

}
