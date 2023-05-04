public class Actor extends Persona{
	private String papel;
	
	public Actor (String nombre, String apellido, String fechaNacimiento, String nacionalidad, String papel){
		super(nombre,apellido,fechaNacimiento,nacionalidad);
		this.papel=papel;
	}
	
	public String getPapel(){
		return papel;
	}
	public void setPapel(String papel){
		this.papel=papel;
	}


	
}