package Ejercicio2;

public class GenericMethods {
	public <T, U, V> void mostrarInformacion(T parametro1, U parametro2, V parametro3) {
        System.out.println("Parametro 1: " + parametro1.toString());
        System.out.println("Parametro 2: " + parametro2.toString());
        System.out.println("Parametro 3: " + parametro3.toString());
    }

}
