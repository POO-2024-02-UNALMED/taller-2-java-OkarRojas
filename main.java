//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main {
    public static void main(String[] args) {

        class Asiento {
            private String color;
            private double precio;
            private int registro;

            public Asiento(String color, double precio, int registro) {
                this.color = color;
                this.precio = precio;
                this.registro = registro;
            }

            public String cambiarColor(String color) {
                String[] coloresValidos = {"rojo", "verde", "amarillo", "negro", "blanco"};
                for (String colorValido : coloresValidos) {
                    if (colorValido.equals(color)) {
                        this.color = color;
                        return color;
                    }
                }
                return null; // Color no válido
            }
        }

        class Auto {
            private static int cantidadCreados = 0;
            private String modelo;
            private double precio;
            private Asiento[] asientos;
            private Motor motor;
            private int registro;

            public Auto(String modelo, double precio, Asiento[] asientos, Motor motor, int registro) {
                this.modelo = modelo;
                this.precio = precio;
                this.asientos = asientos;
                this.motor = motor;
                this.registro = registro;
                cantidadCreados++;
            }

            public int cantidadAsientos() {
                int cantidad = 0;
                for (Asiento asiento : asientos) {
                    if (asiento != null) {
                        cantidad++;
                    }
                }
                return cantidad;
            }

            public String verificarIntegridad() {
                for (Asiento asiento : asientos) {
                    if (asiento != null && (asiento.registro != motor.registro || asiento.registro != registro)) {
                        return "Las piezas no son originales";
                    }
                }
                return "Auto original";
            }
        }

        class Motor {
            private static String[] tiposPosibles = {"electrico", "gasolina"};
            private int numeroCilindros;
            private String tipo;
            private int registro;

            public Motor(int numeroCilindros, String tipo, int registro) {
                this.numeroCilindros = numeroCilindros;
                if (Arrays.asList(tiposPosibles).contains(tipo)) {
                    this.tipo = tipo;
                } else {
                    throw new IllegalArgumentException("Tipo de motor no válido");
                }
                this.registro = registro;
            }

            public void cambiarRegistro(int registro) {
                this.registro = registro;
            }

            public void asignarTipo(String tipo) {
                if (Arrays.asList(tiposPosibles).contains(tipo)) {
                    this.tipo = tipo;
                } else {
                    throw new IllegalArgumentException("Tipo de motor no válido");
                }
            }
        }
    }
}