package uni1a;

public class Temporada {
	//ATRIBUTOS
	
	private int numeroTemporada;
	private int cantidadEpisodios;
	private double duracionCapitulos;
	private String nombreTemporada;
	
	//CONSTRUCTOR
	
	public Temporada(int numeroTemporada, int cantidadEpisodios, double duracionCapitulos, String nombreTemporada) {
		this.numeroTemporada= numeroTemporada;
		this.cantidadEpisodios= cantidadEpisodios;
		this.duracionCapitulos= duracionCapitulos;
		this.nombreTemporada= nombreTemporada; }

	//GETTERS AND SETTERS
	
	public int getNumeroTemporada() { return numeroTemporada;}
	public void setNumeroTemporada(int numeroTemporada) { this.numeroTemporada=numeroTemporada;}
	public int getCantidadEpisodios() { return cantidadEpisodios;}
	public void setCantidadEpisodios(int cantidadEpisodios) { this.cantidadEpisodios=cantidadEpisodios;}
	public double getDuracionCapitulos() { return duracionCapitulos;}
	public void setDuracionCapitulos(double duracionCapitulos) { this.duracionCapitulos=duracionCapitulos;}
	public String getNombreTemporada() { return nombreTemporada;}
	public void setNombreTemporada(String nombreTemporada) { this.nombreTemporada=nombreTemporada;}
}
