/*
 * Crea una clase llamada NoGenericMethods que almacene tres objetos del mismo tipo, 
 * junto con los métodos para almacenar y extraer estos objetos y un constructor para 
 * inicializar los tres. Comprueba que los argumentos pueden ponerse en cualquier posición 
 * en la llamada al constructor.
 */


package Ejercicio1;

public class Principal {
	
	public static void main(String args[]) {
		
		//Se inicializan los 3 objetos llamando al contructor de la clase
		
		NoGenericMethods nogenericmethods = new NoGenericMethods(
				new Persona("Jose", "Serrano Melgada", 30), 
				new Persona("David", "Serrano Lopez", 11), 
				new Persona("Mauricio", "Cruz", 31));
		
		/*
		 Probe cambiando el orden del contructor y el  programa imprime de forma normal los dotos pero siempre en el orden
		 que se hace el llamado en el contructor, esto se debe a que los tres atributos del contructor son del mismo tipo
		 de la clase Persona
		 
		 pero si se cambian los parametros en cada persona puede habar error si se ponen datos string en una variable de tipo numerico
		 */
		/*
		NoGenericMethods nogenericmethods = new NoGenericMethods(
				new Persona("David", "Serrano Lopez", 11), 
				new Persona("Mauricio", "Cruz", 31),
				new Persona("Jose", "Serrano Melgada", 30)); 
		*/
		
		//se llaman al metodo get de cada obejeto, imprimiendo lo que se inicializo
		System.out.println(nogenericmethods.getAlumno().toString());
		System.out.println(nogenericmethods.getMaestro());
		System.out.println(nogenericmethods.getEmpleado());
		
		
		
		
		
	}

}
