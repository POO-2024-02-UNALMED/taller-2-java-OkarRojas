package test;

public class Auto {
    String modelo;
    int precio;
    String marca;
    String cantidadCreados;
    int registro;
    Motor motor;
    Asiento[] asientos;  
    
    int cantidadAsientos(){
        int contador=0;
        for(int i=0; i< asientos.length;i++){
            if (asientos[i] != null){
                contador++;
            }
        }
        return contador;
    }
    String verificarIntegridad(){
        for(Asiento i:asientos){
            if(i instanceof Asiento){
                if(i.registro!=motor.registro || i.registro!=registro || registro!=motor.registro){
                  return"Las piezas no son originales";
                }
                } 
            }    
        return"Auto original";
        }    
}