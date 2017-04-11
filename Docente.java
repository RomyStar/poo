package Docente;
import Colegios.Persona;
public class Docente extends Persona//Primer caso  Crear Docente
  {
	private String asignatura;
	private String codJefatura;
	private String id;
	public Docente(String nombre, String apellido, String rut, String direccion, int telefono, String asignatura,
			String codJefatura, String id) {
		super(nombre, apellido, rut, direccion, telefono);
		this.asignatura = asignatura;
		this.codJefatura = codJefatura;
		this.id = id;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public String getCodJefatura() {
		return codJefatura;
	}
	public void setCodJefatura(String codJefatura) {
		this.codJefatura = codJefatura;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	
	/*public void IngDeDocente()
  	   {
  	   	  System.out.println ("Ingrese Nombre Del Docente");
  	   	  super.setNombre(Lectura.Cadena());
  	   	  System.out.println ("Ingrese Apèllidos Del Docente");
  	   	  super.setApellidos(Lectura.Cadena());
  	   	  System.out.println ("Ingrese Codigo Del Docente");
  	   	  this.setCodigoDoc(Lectura.Cadena());
  	   	  System.out.println ("Ingrese La Facultad Del Docente");
  	   	  this.setFacultad(Lectura.Cadena());
  	   	  System.out.println ("Ingrese El Departamento Del Del Docente");
  	   	  this.setDepartamento(Lectura.Cadena());
  	   }  */
  }