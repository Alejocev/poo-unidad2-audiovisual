package uni1a;

public class Investigador {
	
	//Atributos
	
	private String nombre;
	private String apellido;
	private String nacionalidad;
	private String especialidad;
	private String temaInvestigacion;
	private String documentalParticipante;
	private int añosExperiencia;
	private double duracionDocumental;
	

	// CONSTRUCTOR
	public Investigador(String nombre,String apellido, String nacionalidad, String especialidad, String temaInvestigacion, String documentalParticipante,int añosExperiencia, double duracionDocumental) {
		this.nombre= nombre;
		this.apellido= apellido;
		this.nacionalidad= nacionalidad;
		this.especialidad= especialidad;
		this.temaInvestigacion= temaInvestigacion;
		this.documentalParticipante= documentalParticipante;
		this.añosExperiencia= añosExperiencia;
		this.duracionDocumental= duracionDocumental;}
	
	//GETTERS AND SETTERS
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre= nombre;}
	public String getApellido() {return apellido;}
	public void setApellido(String apellido) {this.apellido= apellido;}
	public String getNacionalidad() {return nacionalidad;}
	public void setNacionalidad(String nacionalidad) {this.nacionalidad= nacionalidad;}
	public String getEspecialidad() {return especialidad;}
	public void setEspecialidad(String especialidad) {this.especialidad= especialidad;}
	public String getTemaInvestigacion() {return temaInvestigacion;}
	public void setTemaInvestigacion(String temaInvestigacion) {this.temaInvestigacion= temaInvestigacion;}
	public String getDocumentalParticipante() {return documentalParticipante;}
	public void setDocumentalParticipante(String documentalParticipante) {this.documentalParticipante= documentalParticipante;}
	public int getAñosExperiencia() {return añosExperiencia;}
	public void setAñosExperiencia(int añosExperiencia) {this.añosExperiencia= añosExperiencia;}
	public double getDuracionDocumental() {return duracionDocumental;}
	public void setDuracionDocumental(double duracionDocumental) {this.duracionDocumental= duracionDocumental;}
	
	
}
