package Ejercicio2;

public class Principal {
	
	public static void main(String args[]) {
		
		
		Persona persona = new Persona("David", "Serrano", 12);
        String mensaje = "Segundo Parametro";
        Integer numero = 12;
        
        System.out.println();
     
        GenericMethods genericMethods = new GenericMethods();
        System.out.println("Primera impresión de los 3 parametros pasados");
        genericMethods.mostrarInformacion(persona, mensaje, numero);
        
        System.out.println();
        
        String nombre = "Jennifer";
        String apellido = "Serrano";
        int edad = 14;
        
        System.out.println("Segunda impresión de los 3 parametros pasados");
        genericMethods.mostrarInformacion(nombre, apellido, edad);
        
        
        System.out.println();
        System.out.println("tercera impresión de los 3 parametros pasados en diferente orden");
        genericMethods.mostrarInformacion(mensaje, numero, persona);
        
	}

}
