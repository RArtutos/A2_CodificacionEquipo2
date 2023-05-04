public class Persona{
	protected String nombre;
	protected String apellido;
	protected String fechaNacimiento;
	protected String nacionalidad;

	public Persona(String nombre, String apellido, String fechaNacimiento, String nacionalidad){
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechaNacimiento=fechaNacimiento;
		this.nacionalidad=nacionalidad;
	}
	
	public String getNombre(){
		return nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public String getFechaNacimiento(){
		return fechaNacimiento;
	}
	public String getNacionalidad(){
		return nacionalidad;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setApellido(String a){
		this.apellido=apellido;
	}
	public void setFechaNacimiento(String fN){
		this.fechaNacimiento=fechaNacimiento;
	}
	public void setNacionalidad(String na){
		this.nacionalidad=nacionalidad;
	}
}