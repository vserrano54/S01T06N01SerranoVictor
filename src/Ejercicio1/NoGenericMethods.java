package Ejercicio1;

public class NoGenericMethods {
	
	private Persona alumno;
	private Persona maestro;
	private Persona empleado;
	
	public NoGenericMethods(Persona alumno, Persona maestro, Persona empleado) {
		this.alumno = alumno;
		this.maestro = maestro;
		this.empleado = empleado;
	}

	public Persona getAlumno() {
		return alumno;
	}

	public void setAlumno(Persona alumno) {
		this.alumno = alumno;
	}

	public Persona getMaestro() {
		return maestro;
	}

	public void setMaestro(Persona maestro) {
		this.maestro = maestro;
	}

	public Persona getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Persona empleado) {
		this.empleado = empleado;
	}

	
	
	
	
	
	
	
	

}
