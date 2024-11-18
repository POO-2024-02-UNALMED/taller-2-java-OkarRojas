package test;
public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;
    @SuppressWarnings("unused")
    void cambiarRegistro(int registro){
        this.registro=registro;
    }
    @SuppressWarnings("unused")
    void asignarTipo(String tipo){
        if ("gasolina".equals(tipo) || "electrico".equals(tipo)){
            this.tipo=tipo;
        }
    }
}